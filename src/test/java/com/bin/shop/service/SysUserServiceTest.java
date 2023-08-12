package com.bin.shop.service;

import com.bin.shop.entity.SysUser;
import com.bin.shop.mapper.UserMapper;
import com.bin.shop.service.impl.UserServiceImpl;
import com.bin.shop.utils.ReflectionTddUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SysUserServiceTest {

    private IUserService userService;
    private UserMapper userMapper;

    @BeforeEach
    public void beforeTest() throws NoSuchFieldException, IllegalAccessException {
        userMapper = mock(UserMapper.class);
        userService = new UserServiceImpl();
        ReflectionTddUtils.setFieldValue(userService, "userMapper", userMapper);
    }

    @Test
    public void addUser() {
        SysUser sysUser = new SysUser();
        sysUser.setUsername("张三");
        sysUser.setAge(12);
        when(userMapper.insert(sysUser)).thenReturn(1);

        int update = userService.addUser(sysUser);

        Assertions.assertEquals(1, update);
    }

    @Test
    public void getUser() {
        SysUser sysUser = new SysUser();
        sysUser.setId(1);
        when(userMapper.selectById(1)).thenReturn(sysUser);

        SysUser result = userService.getUser(1);

        Assertions.assertEquals(1, result.getId());
    }

    @Test
    void updateUserMoney() {
        SysUser sysUser = new SysUser();
        sysUser.setTotalAddMoney(1000);
        sysUser.setRemainMoney(1000);

        when(userService.getUser(1)).thenReturn(sysUser);

        SysUser result = userService.updateUserMoney(1, 1000);

        Assertions.assertEquals(2000, result.getTotalAddMoney());
        Assertions.assertEquals(2000, result.getRemainMoney());
    }

}
