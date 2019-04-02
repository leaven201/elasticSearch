package com.iqiyi.vip.vipes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Optional;

import com.iqiyi.vip.vipes.bean.BookBean;
import com.iqiyi.vip.vipes.bean.LogBean;
import com.iqiyi.vip.vipes.dao.LogRespository;
import com.iqiyi.vip.vipes.service.BookService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VipEsApplicationTests {

    @Resource
    BookService bookService;
    @Resource
    LogRespository logRespository;

    @Test
    public void contextLoads() {
    }

    @Test
    public void svae(){
        BookBean book=new BookBean("4","ES入门教程","Lin","2018-10-01");
        bookService.save(book);
    }

    @Test
    public void findById(){
        Optional<LogBean> opt = logRespository.findById("PgvE2WkBF0IeuldG2gKD");
        LogBean log = opt.get();
        System.out.println(log);
    }

}
