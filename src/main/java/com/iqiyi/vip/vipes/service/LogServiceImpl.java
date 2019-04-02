package com.iqiyi.vip.vipes.service;

import javax.annotation.Resource;
import java.util.Optional;

import com.iqiyi.vip.vipes.bean.LogBean;
import com.iqiyi.vip.vipes.dao.LogRespository;

/**
 * @author Lin ZeBin
 * @date 2019/4/2 18:48
 */
public class LogServiceImpl implements LogService{

    @Resource
    LogRespository logRespository;

    @Override
    public Optional<LogBean> findById(String id) {
        return logRespository.findById(id);
    }
}
