package com.team.demo.entity;

import javax.persistence.*;
import java.util.Optional;

/**
 * @program bookshop
 * @author wmy
 * @description 用户信息类
 * @date 2020/02/24
 */
@Entity
public class UserInfo {
    @Id
    private long userId;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String cellphone;

    @Column
    private String email;

    //无参构造
    public UserInfo(){

    }
    //有参构造
    public UserInfo(long userId,String username,String password,String cellphone,String email){
        this.userId=userId;
        this.username=username;
        this.password=password;
        this.cellphone=cellphone;
        this.email=email;
    }

    public long getId(){
        return userId;
    }

    public void setId(long id){
        this.userId=id;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username=username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password=password;
    }

    public String getCellphone(){
        return cellphone;
    }

    public void setCellphone(String cellphone){
        this.cellphone=cellphone;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email=email;
    }
}
