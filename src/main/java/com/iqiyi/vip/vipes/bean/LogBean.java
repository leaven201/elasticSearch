package com.iqiyi.vip.vipes.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author Lin ZeBin
 * @date 2019/4/2 18:43
 */

@Document(indexName = "auto-exact_worker_worker_test-2019-04-03", type="log")
public class LogBean {
    @Id
    private String id;
    private String fields;
    private String source_host;
    private String message;

    public LogBean() {
    }

    public LogBean(String id, String fields, String source_host, String message) {
        this.id = id;
        this.fields = fields;
        this.source_host = source_host;
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFields() {
        return fields;
    }

    public void setFields(String fields) {
        this.fields = fields;
    }

    public String getSource_host() {
        return source_host;
    }

    public void setSource_host(String source_host) {
        this.source_host = source_host;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "LogBean{" +
            "id='" + id + '\'' +
            ", fields='" + fields + '\'' +
            ", source_host='" + source_host + '\'' +
            ", message='" + message + '\'' +
            '}';
    }
}
