package com.team.demo.vo;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @program bookshop
 * @author wmy
 * @description 订单信息封装类
 * @date 2020/03/09
 */
public class OrderInfoVO {
    private long userId;

    private Date date;

    private long id;

    private List<Map<Long,Integer>> requiredBooks;

    public OrderInfoVO(){}

    public OrderInfoVO(long userId,List<Map<Long,Integer>> requiredBooks,long id,Date date){
        this.userId = userId;
        this.requiredBooks = getRequiredBooks();
        this.id=id;
        this.date=date;
    }

    public long getId(){return this.id;}

    public void setId(long id){this.id = id;}

    public Date getDate(){return this.date;}

    public void setDate(Date date){this.date = date;}

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public List<Map<Long, Integer>> getRequiredBooks() {
        return requiredBooks;
    }

    public void setRequiredBooks(List<Map<Long, Integer>> requiredBooks) {
        this.requiredBooks = requiredBooks;
    }
}
