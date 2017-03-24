package com.yonyou.mybatis.service;

import com.yonyou.mybatis.dao.UserDao;
import com.yonyou.mybatis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xinggq on 17-3-24.
 */
@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public User selectById(String id){
        return userDao.selectById(id);
    }

    public User selectByName(String name) {
        return userDao.selectByName(name);
    }

    public List<User> selectAll(){
        return userDao.selectAll();
    }
}
