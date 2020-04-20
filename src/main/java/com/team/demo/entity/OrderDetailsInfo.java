package com.team.demo.entity;




import javax.persistence.*;

/**
 * @program bookshop
 * @author wmy
 * @description 书籍订单细节类
 * @date 2020/03/5
 */
@Entity
@Table
public class OrderDetailsInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long orderId;

    private int num;

    private long bookId;

    public OrderDetailsInfo(){}

    public OrderDetailsInfo(long id,long orderId, int num, long bookId) {
        this.orderId = orderId;
        this.num = num;
        this.bookId = bookId;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }
}
