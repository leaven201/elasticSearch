package com.iqiyi.vip.vipes.service;

import org.springframework.stereotype.Service;

import java.util.Optional;

import com.iqiyi.vip.vipes.bean.LogBean;

/**
 * @author Lin ZeBin
 * @date 2019/4/2 18:48
 */
@Service
public interface LogService {
    Optional<LogBean> findById(String id);
}
