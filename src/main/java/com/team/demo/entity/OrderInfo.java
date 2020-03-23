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
    private long orderId;

    private Date ordertime;

    private boolean status;

    private BookInfo book;

    private double totalprice;

    private UserInfo user;

    //无参构造
    public OrderInfo(){

    }
    //有参构造
    public OrderInfo(long orderId,Date ordertime,boolean status,BookInfo book,double totalprice,UserInfo user){
        this.orderId=orderId;
        this.ordertime=ordertime;
        this.status=status;
        this.book=book;
        this.totalprice=totalprice;
        this.user=user;
    }

    public long getId(){
        return orderId;
    }

    public void setId(long orderId){
        this.orderId=orderId;
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

    public BookInfo getBook(){
        return book;
    }

    public void setBook(BookInfo book){
        this.book=book;
    }

    public double getPrice(){
        return totalprice;
    }

    public void setPrice(double price){
        this.totalprice=price;
    }

    public UserInfo getUser(){
        return user;
    }

    public void setUser(UserInfo user){
        this.user=user;
    }

    /*public Set<OrderItem> getOrderitems(){
        return orderitems;
    }

    public void setOrderitems(Set<OrderItem> orderitems){
        this.orderitems=orderitems;
    }*/
}
