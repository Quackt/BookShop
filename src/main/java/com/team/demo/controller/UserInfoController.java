package com.team.demo.controller;

import com.team.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program bookshop
 * @author wmy
 * @dedsciption 用户管理服务器
 * @Date 2020/2/24
 */

@RestController
@CrossOrigin
@RequestMapping(value="/users")
public class UserInfoController {
    @Autowired
    UserInfoService userInfoService;
}
