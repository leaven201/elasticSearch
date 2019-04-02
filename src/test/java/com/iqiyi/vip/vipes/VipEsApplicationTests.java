package com.iqiyi.vip.vipes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import com.iqiyi.vip.vipes.bean.BookBean;
import com.iqiyi.vip.vipes.service.BookService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VipEsApplicationTests {

    @Resource
    BookService bookService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void svae(){
        BookBean book=new BookBean("4","ES入门教程","Lin","2018-10-01");
        bookService.save(book);
    }

}
