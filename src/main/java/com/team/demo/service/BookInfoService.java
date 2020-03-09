package com.team.demo.service;

import com.team.demo.entity.BookInfo;
import com.team.demo.repository.BookInfoRepository;
import com.team.demo.vo.BookInfoVO;
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
public class BookInfoService {
    @Autowired
    BookInfoRepository bookInfoRepository;

    public Long addBook() {
        return 0L;
    }

    public void deleteBooks(List<Long> ids) {
    }

    public List<BookInfo> queryBooks(List<BookInfoVO> bookInfos) {
        return null;
    }

    public List<BookInfo> getAllBooks() {
        return null;
    }
}
