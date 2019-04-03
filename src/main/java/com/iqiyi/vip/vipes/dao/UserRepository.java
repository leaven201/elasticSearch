package com.iqiyi.vip.vipes.dao;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.iqiyi.vip.vipes.bean.UserBean;

/**
 * @author Lin ZeBin
 * @date 2019/4/3 15:07
 */
public interface UserRepository extends ElasticsearchRepository<UserBean, String> {

}
