package com.iqiyi.vip.vipes.dao;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.iqiyi.vip.vipes.bean.LogBean;

/**
 * @author Lin ZeBin
 * @date 2019/4/2 18:47
 */
public interface LogRepository extends ElasticsearchRepository<LogBean, String> {
}
