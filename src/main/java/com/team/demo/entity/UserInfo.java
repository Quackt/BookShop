package com.team.demo.entity;

import javax.persistence.Entity;

/**
 * @program bookshop
 * @author wmy
 * @description 用户信息类
 * @date 2020/02/24
 */
@Entity
public class UserInfo {
    private String id;
    private String username;
    private double password;
    private String cellphone;
    private String email;
    private String address;
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username=username;
    }
    public double getPassword(){
        return password;
    }
    public void setPassword(double password){
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
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
}
