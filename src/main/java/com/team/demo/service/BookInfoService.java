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

    /**
     * 添加一本书
     * @return Long
     */
    public Long addBook(BookInfoVO bookInfoVO) {
        return 0L;
    }

    /**
     * 删除一本书
     * @param ids 书籍id
     */
    public void deleteBooks(List<Long> ids) {
    }

    /**
     * 按条件查询书本信息
     * @param bookInfos 书籍信息
     * @return list
     */
    public List<BookInfo> queryBooks(List<BookInfoVO> bookInfos) {
        return null;
    }

    /**
     * 查询所有书籍信息
     * @return list
     */
    public List<BookInfo> getAllBooks() {
        return null;
    }

    /**
     * 上传书的文件
     * @return list
     */
    public void uploadfile() {
    }

    /**
     * 更新书的信息
     * @param bookInfoVO 书籍信息
     */
    public void updateMessage(BookInfoVO bookInfoVO) {
    }

    /**
     * 返回下载链接
     * @param bookInfoVO 书籍信息
     * @return string
     */
    public String getDownloadUrl(BookInfoVO bookInfoVO) {
        String url = "";
        return url;
    }
}
