package com.iqiyi.vip.vipes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Optional;

import com.iqiyi.vip.vipes.bean.LogBean;
import com.iqiyi.vip.vipes.dao.LogRepository;

/**
 * @author Lin ZeBin
 * @date 2019/4/2 18:48
 */
@Service("logService")
public class LogServiceImpl implements LogService{

    @Autowired
    @Qualifier("logRepository")
    LogRepository logRepository;


    @Override
    public Optional<LogBean> findById(String id) {
        return logRepository.findById(id);
    }

    @Override
    public LogBean save(LogBean blog) {
        return logRepository.save(blog);
    }
}
