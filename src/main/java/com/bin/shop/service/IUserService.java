package com.bin.shop.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bin.shop.entity.SysUser;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author bin
 * @since 2023-08-09
 */
public interface IUserService extends IService<SysUser> {

    int addUser(SysUser sysUser);

    SysUser getUser(int i);

    SysUser updateUserMoney(int userId, int money);
}
