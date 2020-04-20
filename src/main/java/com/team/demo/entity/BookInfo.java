package com.team.demo.entity;

import javax.persistence.*;

/**
 * @program bookshop
 * @author wmy
 * @description 书籍信息类
 * @date 2020/02/24
 */
@Entity
public class BookInfo {
    @Id
    private long id;

    @Column
    private String name;

    @Column
    private String category;

    @Column
    private double price;

    @Column
    private String author;

    //private String image;

    private String description;

    private int amount;
    //无参构造
    public BookInfo(){

    }
    //有参构造
    public BookInfo(long id,String name,String category,double price,String author,String image,String description,int amount){
        this.id=id;
        this.name=name;
        this.category=category;
        this.price=price;
        this.author=author;
        //this.image=image;
        this.description=description;
        this.amount=amount;
    }

    //setter和getter方法
    public int getAmount(){
        return amount;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id=id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category=category;
    }

    public double getPrice(){
        return price;
    }

    public void setPrice(double price){
        this.price=price;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){ this.author=author; }



    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description=description;
    }

}
