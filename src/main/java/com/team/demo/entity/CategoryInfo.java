package com.team.demo.entity;

import javax.persistence.Entity;
/**
 * @program bookshop
 * @author lwy
 * @description 书籍类别类
 * @date 2020/03/5
 */
public class CategoryInfo {
    private String id;
    private String name;
    private String description;
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description=description;
    }
}

