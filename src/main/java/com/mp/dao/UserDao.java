package com.mp.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mp.modle.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Mr丶s
 * @ClassName UserDao
 * @Version V1.0
 * @Date 2018/11/19 15:03
 * @Description
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

    void save(User user);

}
