package com.team.demo.repository;


import com.team.demo.entity.UserInfo;
import com.team.demo.vo.UserInfoVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program bookshop
 * @author wmy
 * @date 2020/02/24
 */
@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo,Long>{
    @Query("delete from UserInfo t where t.id in :ids")
    void deleteById(List<Long> ids);

    @Override
    List<UserInfo> findAll();


    List<UserInfo> findByUsername(String username);

    List<UserInfo> findByCellphone(String cellphone);

    List<UserInfo> findByEmail(String email);

    List<UserInfo> findById(long id);
}
