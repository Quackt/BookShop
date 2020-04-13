package com.team.demo.repository;


import com.team.demo.entity.UserInfo;
import com.team.demo.vo.UserInfoVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program bookshop
 * @author wmy
 * @date 2020/02/24
 */
@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo,Long>{
    void saveAndFlush(UserInfoVO userInfoVO);

    void deleteById(List<Long> ids);
    @Override
    List<UserInfo> findAll();
    List<UserInfo> findAll(List<UserInfoVO> userInfos);
    List<UserInfo> findById(List<Long> ids);

}
