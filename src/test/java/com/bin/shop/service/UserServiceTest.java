package com.bin.shop.service;

import com.bin.shop.entity.User;
import com.bin.shop.mapper.UserMapper;
import com.bin.shop.service.impl.UserServiceImpl;
import com.bin.shop.utils.ReflectionTddUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UserServiceTest {

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
        User user = new User();
        user.setUsername("张三");
        user.setAge(12);
        when(userMapper.addUser(user)).thenReturn(1);

        int update = userService.addUser(user);

        Assertions.assertEquals(1, update);
    }

    @Test
    public void getUser() {
        User user = new User();
        user.setId(1);
        when(userMapper.getUser(1)).thenReturn(user);

        User result = userService.getUser(1);

        Assertions.assertEquals(1,result.getId());
    }

}
