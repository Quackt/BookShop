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
    private long id;

    private String name;

    private double price;

    private String author;

    private String image;

    private String description;

    private CategoryInfo category;

    private int amount;

    public int getAmount(){return amount;}

    public void setAmount(int amount){this.amount = amount;}

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

    public String getImage(){
        return image;
    }

    public void setImage(String image){
        this.image=image;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description=description;
    }

    public CategoryInfo getCategory(){
        return category;
    }

    public void setCategory(CategoryInfo category){
        this.category= category;
    }
}
