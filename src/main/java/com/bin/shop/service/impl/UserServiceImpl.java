package com.bin.shop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bin.shop.entity.SysUser;
import com.bin.shop.mapper.UserMapper;
import com.bin.shop.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author bin
 * @since 2023-08-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, SysUser> implements IUserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public int addUser(SysUser sysUser) {
        return userMapper.insert(sysUser);
    }

    @Override
    public SysUser getUser(int id) {
        return userMapper.selectById(id);
    }

    @Override
    public SysUser updateUserMoney(int userId, int money) {
        SysUser user = this.getUser(userId);
        Integer totalAddMoney = user.getTotalAddMoney() + money;
        Integer remainMoney = user.getRemainMoney() + money;
        user.setTotalAddMoney(totalAddMoney);
        user.setRemainMoney(remainMoney);
        userMapper.updateById(user);
        return user;
    }
}
