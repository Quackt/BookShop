package com.team.demo.entity;
/**
 * 书籍订单项
 */
public class OrderItem {
    private String id;
    private BookInfo book;
    private int quantity;
    private double price;

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
    public BookInfo getBook(){
        return book;
    }
    public void setBook(BookInfo book){
        this.book=book;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
}
