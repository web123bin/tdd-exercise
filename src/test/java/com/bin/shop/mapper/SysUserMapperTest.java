package com.bin.shop.mapper;

import com.baomidou.mybatisplus.test.autoconfigure.MybatisPlusTest;
import com.bin.shop.entity.SysUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

@MybatisPlusTest
public class SysUserMapperTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void addUser() {
        SysUser sysUser = new SysUser();
        sysUser.setUsername("张三");
        sysUser.setAge(18);

        int update = userMapper.insert(sysUser);

        Assertions.assertEquals(1, update);
    }

    @Test
    public void getUser() {
        SysUser result = userMapper.selectById(1);

        Assertions.assertEquals(1, result.getId());
        Assertions.assertEquals("张三", result.getUsername());
    }

}
