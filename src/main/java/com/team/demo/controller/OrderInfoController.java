package com.team.demo.controller;

import com.team.demo.entity.OrderInfo;
import com.team.demo.service.OrderInfoService;
import com.team.demo.vo.OrderInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program bookshop
 * @author wmy
 * @dedsciption 订单管理服务器
 * @Date 2020/3/9
 */
@RestController
@CrossOrigin
@RequestMapping(value="/orders")
public class OrderInfoController {
    @Autowired
    OrderInfoService orderInfoService;

    @PostMapping("/newOrder")
    public Long createOrder(@RequestBody OrderInfoVO orderInfoVO){
        return orderInfoService.createOrder();
    }

    @PostMapping("/cancle")
    public void cancleOrder(@RequestParam(name="orderId") long orderId){
        orderInfoService.cancleOrder(orderId);
    }

    @PostMapping("/queryOrders")
    public List<OrderInfo> queryOrders(@RequestBody List<Long> ids){
        return orderInfoService.queryOrders(ids);
    }

    @GetMapping("/getAllOrders")
    public List<OrderInfo> getAllOrders(){
        return orderInfoService.getAllOrders();
    }

    @DeleteMapping("/delete")
    public void deleteOrders(@RequestParam List<Long> ids){
        orderInfoService.deleteOrders(ids);
    }
}
