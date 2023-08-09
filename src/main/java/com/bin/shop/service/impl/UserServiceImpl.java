package com.bin.shop.service.impl;

import com.bin.shop.entity.User;
import com.bin.shop.mapper.UserMapper;
import com.bin.shop.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author bin
 * @since 2023-08-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
