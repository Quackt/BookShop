package com.team.demo.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * @program bookshop
 * @author lwy
 * @description 书籍订单类
 * @date 2020/03/5
 */
public class OrderInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private Date ordertime;

    private boolean status;

    private double price;

    private UserInfo user;

    private Set<OrderItem> orderitems=new HashSet<OrderItem>();

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id=id;
    }

    public Date getOrdertime(){
        return ordertime;
    }

    public void setOrdertime(Date ordertime){
        this.ordertime=ordertime;
    }

    public boolean isStatus(){
        return status;
    }

    public void setStatus(boolean status){
        this.status=status;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public UserInfo getUser(){
        return user;
    }

    public void setUser(UserInfo user){
        this.user=user;
    }

    public Set<OrderItem> getOrderitems(){
        return orderitems;
    }

    public void setOrderitems(Set<OrderItem> orderitems){
        this.orderitems=orderitems;
    }
}