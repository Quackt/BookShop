package com.team.demo.vo;

import com.team.demo.entity.BookInfo;

import java.awt.print.Book;

/**
 * @program bookshop
 * @author wmy
 * @description 书籍信息封装类
 * @date 2020/03/09
 */
public class BookInfoVO {
    private long id;

    private String name;

    private String author;

    private String category;

    private String keyword;

    private int amount;

    private String image;

    public BookInfoVO(){}

    public BookInfoVO(long id,String name,String author,String category,String keyword){
        this.id = id;
        this.name = name;
        this.author = author;
        this.category = category;
        this.keyword = keyword;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
