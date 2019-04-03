package com.iqiyi.vip.vipes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.iqiyi.vip.vipes.bean.UserBean;
import com.iqiyi.vip.vipes.dao.UserRepository;

/**
 * @author Lin ZeBin
 * @date 2019/4/3 15:08
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    @Qualifier("userRepository")
    UserRepository userRepository;

    @Override
    public UserBean save(UserBean blog) {
        return userRepository.save(blog);
    }
}
