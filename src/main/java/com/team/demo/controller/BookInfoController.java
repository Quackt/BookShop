package com.team.demo.controller;

import com.team.demo.entity.BookInfo;
import com.team.demo.repository.BookInfoRepository;
import com.team.demo.service.BookInfoService;
import com.team.demo.vo.BookInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program bookshop
 * @author wmy
 * @dedsciption 书籍管理服务器
 * @Date 2020/2/24
 */

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value="/books")
public class BookInfoController {
   @Autowired
   BookInfoService bookInfoService;

    @PostMapping("/addBook")
    public Long addBook(@RequestBody BookInfoVO bookInfoVO){
        return bookInfoService.addBook(bookInfoVO);
    }

    @PostMapping("/uploadfile")
    public void uploadfile(@RequestParam String url){
        bookInfoService.uploadfile();
    }

    @PostMapping("/update")
    public void updateMassege(@RequestBody BookInfo bookInfo){
        bookInfoService.updateMessage(bookInfo);
    }

    @GetMapping("/download")
    public String getDownloadUrl(@RequestParam BookInfoVO bookInfoVO){
        return bookInfoService.getDownloadUrl(bookInfoVO);
    }

    @DeleteMapping("/delete")
    public void deleteBooks(@RequestBody List<Long> ids){
        bookInfoService.deleteBooks(ids);
    }

    @PostMapping("/queryBooks")
    public List<BookInfo> queryBooks(@RequestParam BookInfoVO bookInfoVO){
        return bookInfoService.queryBooks(bookInfoVO);
    }

    @GetMapping("/getAllBooks")
    public List<BookInfo> getAllBooks(){
        return bookInfoService.getAllBooks();
    }
}
