package com.team.demo.service;

import com.team.demo.entity.UserInfo;
import com.team.demo.repository.UserInfoRepository;
import com.team.demo.utils.IdGeneratorUtils;
import com.team.demo.vo.UserInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.rowset.BaseRowSet;
import java.util.List;
import java.util.Optional;

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
        UserInfo auser=new UserInfo();
        auser.setId(idGenerator.snowflakeId());
        auser.setUsername(userInfoVO.getUsername());
        auser.setPassword(userInfoVO.getPassword());
        auser.setCellphone(userInfoVO.getCellphone());
        auser.setEmail(userInfoVO.getEmail());
        userInfoRepository.save(auser);
        return auser.getId();
    }

    /**
     * 更新用户信息
     * @param userInfoVO 用户信息
     */
    public void updateMessage(UserInfoVO userInfoVO)  {
        userInfoRepository.saveAndFlush(userInfoVO);
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
     * @param userInfos 查询条件
     * @return List 用户信息表
     */
    public List<UserInfo> queryUsers(List<UserInfoVO> userInfos) {
        //我没找到userInfos的get方法，或是我理解不对?
        return userInfoRepository.findAll(userInfos);
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
    public boolean login(String password, Long account) {
        //这里的account我按userId写的，还是说实体类里要添账号这一项？
        if(!userInfoRepository.findById(account).isPresent())
            return false;
        else
            return password.equals(userInfoRepository.getOne(account).getPassword());
    }
}
