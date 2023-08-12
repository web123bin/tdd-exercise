package com.bin.shop.service;

import com.bin.shop.mapper.RechargeRecordMapper;
import com.bin.shop.service.impl.RechargeRecordServiceImpl;
import com.bin.shop.service.impl.UserServiceImpl;
import com.bin.shop.utils.ReflectionTddUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RechargeServiceTest {

    private IRechargeRecordService rechargeRecordService;
    private RechargeRecordMapper rechargeRecordMapper;
    private IUserService userService;

    @BeforeEach
    public void before() throws NoSuchFieldException, IllegalAccessException {
        rechargeRecordMapper = mock(RechargeRecordMapper.class);
        userService = mock(UserServiceImpl.class);
        rechargeRecordService = new RechargeRecordServiceImpl();
        ReflectionTddUtils.setFieldValue(rechargeRecordService, "rechargeRecordMapper", rechargeRecordMapper);
        ReflectionTddUtils.setFieldValue(rechargeRecordService, "userService", userService);
    }

    @Test
    public void addMoney() {
        when(rechargeRecordMapper.addMoney(1, 1000)).thenReturn(1);
        when(userService.updateUserMoney(1, 1000)).thenReturn(null);

        int update = rechargeRecordService.addMoney(1, 1000);

        Assertions.assertEquals(1, update);
    }

}
