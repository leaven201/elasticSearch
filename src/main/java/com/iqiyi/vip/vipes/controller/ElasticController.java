package com.iqiyi.vip.vipes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

import com.iqiyi.vip.vipes.bean.BookBean;
import com.iqiyi.vip.vipes.service.BookService;

/**
 * @author Lin ZeBin
 * @date 2019/4/2 17:27
 */
@RestController
public class ElasticController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/book/{id}")
    @ResponseBody
    public BookBean getBookById(@PathVariable String id){
        Optional<BookBean> opt =bookService.findById(id);
        BookBean book=opt.get();
        System.out.println(book);
        return book;
    }

    @RequestMapping("/save")
    @ResponseBody
    public void Save(){
        BookBean book1=new BookBean("1","ES入门教程","Lin","2018-10-01");
        BookBean book2=new BookBean("2","ES入门教程","Lin","2018-10-01");
        System.out.println(book1);
        System.out.println(book2);
        bookService.save(book1);
        bookService.save(book2);
    }


}

