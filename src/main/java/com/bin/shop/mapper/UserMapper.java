package com.bin.shop.mapper;

import com.bin.shop.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author bin
 * @since 2023-08-09
 */
public interface UserMapper extends BaseMapper<User> {

    User getUser(int id);

    int addUser(User user);
}
