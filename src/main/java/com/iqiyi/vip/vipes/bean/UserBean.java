package com.iqiyi.vip.vipes.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author Lin ZeBin
 * @date 2019/4/3 15:05
 */
@Document(indexName = "book", type="doc")
public class UserBean {
    @Id
    private String id;
    private String user;
    private String message;
    private String postDate;

    public UserBean(){}

    public UserBean(String id, String user, String message, String postDate) {
        this.id = id;
        this.user = user;
        this.message = message;
        this.postDate = postDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    @Override
    public String toString() {
        return "UserBean{" +
            "id='" + id + '\'' +
            ", user='" + user + '\'' +
            ", message='" + message + '\'' +
            ", postDate='" + postDate + '\'' +
            '}';
    }
}
