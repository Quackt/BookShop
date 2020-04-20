package com.team.demo.controller;

import com.team.demo.entity.UserInfo;
import com.team.demo.service.UserInfoService;
import com.team.demo.vo.UserInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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


    @PostMapping("/addUser")
    public Long addUser(@RequestBody UserInfoVO userInfoVO){
        return userInfoService.addUser(userInfoVO);
    }

    @PostMapping("/update")
    public void updateMassege(@RequestBody UserInfo userInfo){
        userInfoService.updateMessage(userInfo);
    }

    @DeleteMapping("/delete")
    public void deleteUsers(@RequestBody List<Long> ids){
        userInfoService.deleteUsers(ids);
    }

    @PostMapping("/queryBooks")
    public List<UserInfo> queryUsers(@RequestParam UserInfoVO userInfo){
        return userInfoService.queryUsers(userInfo);
    }

    @GetMapping("/getAllBooks")
    public List<UserInfo> getAllUsers(){
        return userInfoService.getAllUsers();
    }

    @PostMapping("/login")
    public boolean login(@RequestBody String password,@RequestParam("account")String account){return userInfoService.login(password,account);}
}
