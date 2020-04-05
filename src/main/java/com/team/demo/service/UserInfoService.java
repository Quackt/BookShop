package com.team.demo.service;

import com.team.demo.entity.UserInfo;
import com.team.demo.repository.UserInfoRepository;
import com.team.demo.vo.UserInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    /**
     * 添加一个用户
     * @param userInfoVO 用户信息
     * @return Long 用户id
     */
    public long addUser(UserInfoVO userInfoVO)
    {
        UserInfo auser=new UserInfo();
        auser.setId(userInfoVO.getUserId());
        auser.setUsername(userInfoVO.getUsername());
        auser.setPassword(userInfoVO.getPassword());
        auser.setCellphone(userInfoVO.getCellphone());
        auser.setEmail(userInfoVO.getEmail());
        return auser.getId();
    }

    /**
     * 更新用户信息
     * @param userInfoVO 用户信息
     */
    public void updateMessage(UserInfoVO userInfoVO) {
    }

    /**
     * 删除用户
     * @param ids 用户id
     */
    public void deleteUsers(List<Long> ids) {
    }

    /**
     * 查询用户信息
     * @param userInfos 查询条件
     * @return List 用户信息表
     */
    public List<UserInfo> queryUsers(List<UserInfoVO> userInfos) {
        return null;
    }

    /**
     * 返回所有用户
     * @return List 用户信息表
     */
    public List<UserInfo> getAllUsers() {
        return null;
    }
}
