package com.team.demo.repository;

import com.team.demo.entity.OrderInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @program bookshop
 * @author wmy
 * @date 2020/02/24
 */
@Repository
public interface OrderInfoRepository extends JpaRepository<OrderInfo,Long> {
    @Modifying
    @Query("update order_info t set t.status =: status where t.id =: id")
    void updateStatusById(@Param("id")long id,@Param("status")OrderInfo.Status status);

    @Query("select t from order_info t where t.id in (:ids)")
    List<OrderInfo> findByIds(@Param("ids")List<Long> ids);

    @Query("delete from order_info t where t.id in (:ids)")
    void deleteByIds(List<Long> ids);
}
