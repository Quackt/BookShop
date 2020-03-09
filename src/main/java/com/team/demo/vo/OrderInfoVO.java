package com.team.demo.vo;

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

    private List<Map<Long,Integer>> requiredBooks;

    public OrderInfoVO(){}

    public OrderInfoVO(long userId,List<Map<Long,Integer>> requiredBooks){
        this.userId = userId;
        this.requiredBooks = getRequiredBooks();
    }

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
