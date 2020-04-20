package com.team.demo.service;

import com.team.demo.entity.UserInfo;
import com.team.demo.repository.UserInfoRepository;
import com.team.demo.utils.IdGeneratorUtils;
import com.team.demo.vo.UserInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.rowset.BaseRowSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;

/**
 * @program bookshop
 * @author wmy
 * @description 用户信息管理服务层
 * @date 2020/02/24
 */
@Service
public class UserInfoService {
    @Autowired
    UserInfoRepository userInfoRepository;
    private Object UserInfo;
    private IdGeneratorUtils idGenerator;

    /**
     * 添加一个用户
     * @param userInfoVO 用户信息
     * @return Long 用户id
     */
    public long addUser(UserInfoVO userInfoVO)
    {
        UserInfo user=new UserInfo();
        user.setId(idGenerator.snowflakeId());
        user.setUsername(userInfoVO.getUsername());
        user.setPassword(userInfoVO.getPassword());
        user.setCellphone(userInfoVO.getCellphone());
        user.setEmail(userInfoVO.getEmail());
        userInfoRepository.save(user);
        return user.getId();
    }

    /**
     * 更新用户信息
     * @param userInfo 用户信息
     */
    public void updateMessage(UserInfo userInfo)  {
        userInfoRepository.saveAndFlush(userInfo);
    }

    /**
     * 删除用户
     * @param ids 用户id
     */
    public void deleteUsers(List<Long> ids) {
        userInfoRepository.deleteById(ids);
    }

    /**
     * 查询用户信息
     * @param userInfoVO 查询条件
     * @return List 用户信息表
     */
    public List<UserInfo> queryUsers(UserInfoVO userInfoVO) {
        if(userInfoVO.getUserId() != 0) {
            return userInfoRepository.findById(userInfoVO.getUserId());
        }else if(!userInfoVO.getUsername().equals("")){
            return userInfoRepository.findByUserame(userInfoVO.getUsername());
        }else if(!userInfoVO.getCellphone().equals("")){
            return userInfoRepository.findByCellphone(userInfoVO.getCellphone());
        }else if(!userInfoVO.getEmail().equals("")){
            return userInfoRepository.findByEmail(userInfoVO.getEmail());
        }
    }

    /**
     * 返回所有用户
     * @return List 用户信息表
     */
    public List<UserInfo> getAllUsers() {
        return userInfoRepository.findAll();
    }

    /**
     * 判断是否登录成功
     * @return boolean 是否成功
     */
    public boolean login(String password, String account) {
        String pattern = "^1[34578]\\d{9}$";
        boolean isMatch = Pattern.matches(pattern, account);
        List<UserInfo> userInfos = new ArrayList<UserInfo>();
        if(isMatch){
            userInfos = userInfoRepository.findByCellphone(account);
        }else{
            userInfos = userInfoRepository.findByEmail(account);
        }
        if(userInfos.isEmpty()||!userInfos.get(0).getPassword().equals(password)){
            return false;
        }
        return true;
    }
}
