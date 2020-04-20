package com.team.demo.repository;

import com.team.demo.entity.OrderDetailsInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailsInfoRepository extends JpaRepository<OrderDetailsInfo,Long> {
    List<OrderDetailsInfo> findByOrderId(long orderId);
}
