package com.team.demo.service;

import cn.hutool.db.sql.Order;
import com.team.demo.entity.BookInfo;
import com.team.demo.entity.OrderInfo;
import com.team.demo.repository.OrderInfoRepository;
import com.team.demo.vo.OrderInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program bookshop
 * @author wmy
 * @description 书籍管理服务层
 * @date 2020/02/24
 */
@Service
public class OrderInfoService {
    @Autowired
    OrderInfoRepository orderInfoRepository;

    /**
     * 创建订单并储存
     * @return Long
     */
    public Long createOrder(OrderInfoVO orderInfoVO) {
        OrderInfo anorder=new OrderInfo();
        anorder.setId(orderInfoVO.getId());
        anorder.setBook((BookInfo) orderInfoVO.getRequiredBooks());
        anorder.setUser(orderInfoVO.getUserId());
        anorder.setOrdertime(orderInfoVO.getDate());
        return anorder.getId();
    }

    /**
     * 取消数据订单
     * @param orderId 目标订单Id
     */
    public void cancleOrder(long orderId) {
    }

    /**
     * 查询指定数据订单信息
     * @param ids 目标id
     * @return List 订单信息集合
     */
    public List<OrderInfo> queryOrders(List<Long> ids) {
        return null;
    }

    /**
     * 查询指定数据订单信息
     * @return List 订单信息集合
     */
    public List<OrderInfo> getAllOrders() {
        return null;
    }

    /**
     * 删除指定数据订单信息
     * @param ids 目标id
     */
    public void deleteOrders(List<Long> ids) {
    }
}
