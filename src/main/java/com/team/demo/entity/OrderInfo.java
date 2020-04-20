package com.team.demo.entity;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
/**
 * @program bookshop
 * @author lwy
 * @description 书籍订单类
 * @date 2020/03/5
 */
@Entity
public class OrderInfo {

    public static enum Status {FINISHED,CANCLED,UNFINISHED};
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column
    private String ordertime;

    @Column
    @Enumerated(EnumType.STRING)
    private Status status;

    @Column
    private BookInfo book;

    @Column
    private double totalprice;

    @Column
    private long userId;

    //无参构造
    public OrderInfo(){

    }
    //有参构造
    public OrderInfo(long id,BookInfo book,double totalprice,long userId){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        this.id=id;
        this.ordertime=df.format(new Date());
        this.status=Status.UNFINISHED;
        this.book=book;
        this.totalprice=totalprice;
        this.userId=userId;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id=id;
    }

    public String getOrdertime(){
        return ordertime;
    }

    public void setOrdertime(String ordertime){
        this.ordertime=ordertime;
    }

    public Status getStatus(){
        return status;
    }

    public void setStatus(Status status){
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

    public long getUserId(){
        return userId;
    }

    public void setUser(long userId){
        this.userId=userId;
    }

    /*public Set<OrderItem> getOrderitems(){
        return orderitems;
    }

    public void setOrderitems(Set<OrderItem> orderitems){
        this.orderitems=orderitems;
    }*/
}


