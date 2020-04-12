package com.team.demo.service;

import com.team.demo.entity.BookInfo;
import com.team.demo.repository.BookInfoRepository;
import com.team.demo.vo.BookInfoVO;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.MultiDoc;
import java.awt.print.Book;
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
        BookInfo bookInfo=new BookInfo();
        //bookInfo.setId(bookInfoVO.getId());改成用你之前写的类来生成id

        bookInfo.setName(bookInfoVO.getName());
        bookInfo.setCategory(bookInfoVO.getCategory());
        bookInfo.setAuthor(bookInfoVO.getAuthor());
        bookInfoRepository.save(bookInfo);
        return bookInfo.getId();
    }

    /**
     * 删除一本书
     * @param ids 书籍id
     */
    public void deleteBooks(List<Long> ids) {
        bookInfoRepository.deleteByIds(ids);
    }

    /**
     * 按条件查询书本信息
     * @param bookInfoVO 书籍信息
     * @return list
     */
    public List<BookInfo> queryBooks(BookInfoVO bookInfoVO) {
        if(bookInfoVO.getId()!=0) {
            return bookInfoRepository.findById(bookInfoVO.getId());
        }else if(!bookInfoVO.getAuthor().equals("")){
            return bookInfoRepository.findByAuthor(bookInfoVO.getAuthor());
        }else if(!bookInfoVO.getCategory().equals("")){
            return bookInfoRepository.findByCategory(bookInfoVO.getCategory());
        }else if(!bookInfoVO.getName().equals("")){
            return bookInfoRepository.findByName(bookInfoVO.getName());
        }else{
            return bookInfoRepository.findByKeyword(bookInfoVO.getKeyword());
        }
    }


    /**
     * 查询所有书籍信息
     * @return list
     */
    public List<BookInfo> getAllBooks() {
        return bookInfoRepository.findAll();
    }
    /**
     * 更新书的信息
     * @param bookInfo 书籍信息
     */
    public void updateMessage(BookInfo bookInfo) {
        bookInfoRepository.saveAndFlush(bookInfo);
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

    /**
     * 上传书的文件
     * @return list
     */
    public void uploadfile() {
    }

}
