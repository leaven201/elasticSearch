package com.iqiyi.vip.vipes.bean;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author Lin ZeBin
 * @date 2019/4/2 18:43
 */
@Data
@Document(indexName = "auto-exact_worker_worker_test-*")
public class LogBean {
    @Id
    private String id;
    private String fields;
    private String source_host;
    private String message;
}
