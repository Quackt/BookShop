package com.team.demo.repository;

import com.team.demo.entity.BookInfo;
import org.springframework.data.jpa.repository.JpaRepository;
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
public interface BookInfoRepository extends JpaRepository<BookInfo,Long> {
    @Query("delete from BookInfo t where t.id in :ids")
    void deleteByIds(@Param("ids") List<Long> ids);

    List<BookInfo> findByAuthor(String author);

    List<BookInfo> findByCategory(String category);

    List<BookInfo> findByName(String name);

    @Query("select t from BookInfo t where t.author like concat('%',:keyword,'%') or t.name like concat('%',:keyword,'%') or t.category like concat('%',:keyword,'%')")
    List<BookInfo> findByKeyword(@Param("keyword")String keyword);

    List<BookInfo> findById(long id);

    @Override
    List<BookInfo> findAll();
}
