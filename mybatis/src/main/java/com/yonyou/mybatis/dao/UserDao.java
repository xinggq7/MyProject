package com.yonyou.mybatis.dao;

import com.yonyou.mybatis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by xinggq on 17-3-24.
 */
@Mapper
public interface UserDao {

    User selectById(String id);

    @Select("select * from user where name = #{name}")
    User selectByName(String name);

    @Select("select * from user")
    List<User> selectAll();

}
