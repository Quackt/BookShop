package com.team.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @program bookshop
 * @author wmy
 * @description 书籍信息类
 * @date 2020/02/24
 */
@Entity
public class BookInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long bookId;

    private String name;

    private String category;

    private double price;

    private String author;

    //private String image;

    private String description;

    private int amount;
    //无参构造
    public BookInfo(){

    }
    //有参构造
    public BookInfo(long bookId,String name,String category,double price,String author,String image,String description,int amount){
        this.bookId=bookId;
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
        return bookId;
    }

    public void setId(long id){
        this.bookId=bookId;
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

    /*public String getImage(){
        return image;
    }

    public void setImage(String image){
        this.image=image;
    }*/

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description=description;
    }

}
