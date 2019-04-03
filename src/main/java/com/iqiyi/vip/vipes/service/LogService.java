package com.iqiyi.vip.vipes.service;

import java.util.Optional;

import com.iqiyi.vip.vipes.bean.LogBean;

/**
 * @author Lin ZeBin
 * @date 2019/4/2 18:48
 */

public interface LogService {
    Optional<LogBean> findById(String id);
    LogBean save(LogBean blog);
}
