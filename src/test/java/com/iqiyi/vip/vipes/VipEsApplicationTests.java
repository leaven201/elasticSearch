package com.iqiyi.vip.vipes;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.entity.ContentType;
import org.apache.http.nio.entity.NStringEntity;
import org.elasticsearch.client.Response;
import org.elasticsearch.client.RestClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;

import com.iqiyi.vip.vipes.bean.BookBean;
import com.iqiyi.vip.vipes.bean.LogBean;
import com.iqiyi.vip.vipes.bean.UserBean;
import com.iqiyi.vip.vipes.service.BookService;
import com.iqiyi.vip.vipes.service.LogService;
import com.iqiyi.vip.vipes.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VipEsApplicationTests {

    @Resource
    BookService bookService;
    @Resource
    UserService userService;
    @Resource
    LogService logService;
//    @Resource
//    LogRespository logRespository;

    @Test
    public void contextLoads() {
    }

    @Test
    public void savebook(){
        BookBean book=new BookBean("6","ES入门","Lin","2018-10-06");
        bookService.save(book);
    }
    @Test
    public void bookFindById(){
        Optional<BookBean> opt =bookService.findById("1");
        BookBean book = opt.get();
        System.out.println(book);
    }
    @Test
    public void LogFindById(){
        Optional<LogBean> opt =logService.findById("Fz0U4mkB-6Rh_Z_LRqSj");
        LogBean log = opt.get();
        System.out.println(log);
    }
    @Test
    public void saveUser(){
        UserBean user=new UserBean("13","Lin","test","2019-04-06");
        userService.save(user);
    }

    @Test
    public void saveLog(){
        LogBean log = new LogBean("1","test","127.0.0.1","test");
        logService.save(log);
    }

//    @Test
//    public void findById(){
//        Optional<LogBean> opt = logRespository.findById("F4sX4WkBEDtLyB97fzie");
//        LogBean log = opt.get();
//        System.out.println(log);
//    }
    @Test
    public void restClient() throws IOException {
        RestClient restClient = RestClient.builder(
            new HttpHost("vip-act-elasticsearch-online001-bdwg.qiyi.virtual", 9200, "http")).build();
        Response response = restClient.performRequest("GET", "/");
        System.out.println(response);
        Map<String, String> params = Collections.singletonMap("pretty", "true");
        response = restClient.performRequest("GET", "/", params);
        System.out.println(response);
        params = Collections.emptyMap();
        String jsonString = "{" +
            "\"user\":\"kimchy\"," +
            "\"postDate\":\"2013-01-30\"," +
            "\"message\":\"trying out Elasticsearch\"" +
            "}";
        HttpEntity entity = new NStringEntity(jsonString, ContentType.APPLICATION_JSON);
        response = restClient.performRequest("PUT", "/book/doc/5", params, entity);
        System.out.println(response);
    }

}
