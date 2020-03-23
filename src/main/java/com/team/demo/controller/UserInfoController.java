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
    public Long addBook(@RequestBody UserInfoVO userInfoVO){
        return userInfoService.addUser(userInfoVO);
    }

    @PostMapping("/update")
    public void updateMassege(@RequestBody UserInfoVO userInfoVO){
        userInfoService.updateMessage(userInfoVO);
    }

    @DeleteMapping("/delete")
    public void deleteBooks(@RequestBody List<Long> ids){
        userInfoService.deleteUsers(ids);
    }

    @PostMapping("/queryBooks")
    public List<UserInfo> queryUsers(@RequestParam List<UserInfoVO> userInfos){
        return userInfoService.queryUsers(userInfos);
    }

    @GetMapping("/getAllBooks")
    public List<UserInfo> getAllUsers(){
        return userInfoService.getAllUsers();
    }
}
