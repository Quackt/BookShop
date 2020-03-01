package com.team.demo.repository;


import com.team.demo.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @program bookshop
 * @author wmy
 * @date 2020/02/24
 */
@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo,Long>{
}
