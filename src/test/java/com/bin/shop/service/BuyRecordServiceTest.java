package com.bin.shop.service;

import com.bin.shop.entity.SysUser;
import com.bin.shop.mapper.BuyRecordMapper;
import com.bin.shop.mapper.UserMapper;
import com.bin.shop.service.impl.BuyRecordServiceImpl;
import com.bin.shop.utils.ReflectionTddUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BuyRecordServiceTest {

    private IBuyRecordService buyRecordService;
    private IScoreService scoreService;
    private BuyRecordMapper buyRecordMapper;
    private UserMapper userMapper;

    @BeforeEach
    public void before() throws NoSuchFieldException, IllegalAccessException {
        buyRecordService = new BuyRecordServiceImpl();
        scoreService = mock(IScoreService.class);
        buyRecordMapper = mock(BuyRecordMapper.class);
        userMapper = mock(UserMapper.class);
        ReflectionTddUtils.setFieldValue(buyRecordService, "buyRecordMapper", buyRecordMapper);
        ReflectionTddUtils.setFieldValue(buyRecordService, "userMapper", userMapper);
        ReflectionTddUtils.setFieldValue(buyRecordService, "scoreService", scoreService);
    }

    @Test
    public void buyGood() {
        SysUser sysUser = new SysUser();
        sysUser.setId(1);
        sysUser.setTotalAddMoney(3000);
        sysUser.setTotalUseMoney(0);
        sysUser.setRemainMoney(3000);
        when(userMapper.selectById(1)).thenReturn(sysUser);
        when(userMapper.updateById(sysUser)).thenReturn(1);
        when(scoreService.calcSore(3000)).thenReturn(1);
        when(scoreService.updateUserScore(1, scoreService.calcSore(3000))).thenReturn(1);
        when(buyRecordMapper.buyGood(1, 3000, "apple")).thenReturn(1);

        int result = buyRecordService.buyGood(1, 3000, "apple");

        Assertions.assertEquals(1, result);
    }



}
