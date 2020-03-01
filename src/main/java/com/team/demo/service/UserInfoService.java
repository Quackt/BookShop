package com.team.demo.service;

import com.team.demo.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
