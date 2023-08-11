package com.bin.shop.service;

import com.bin.shop.entity.User;
import com.bin.shop.mapper.BuyRecordMapper;
import com.bin.shop.mapper.UserMapper;
import com.bin.shop.service.impl.BuyRecordServiceImpl;
import com.bin.shop.utils.ReflectionTddUtils;
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
        User user = new User();
        user.setId(1);
        user.setTotalUseMoney(3000);
        when(userMapper.getUser(1)).thenReturn(user);
        when(scoreService.calcSore(3000)).thenReturn(1);
        when(scoreService.updateUserScore(1,scoreService.calcSore(3000))).thenReturn(1);
        when(buyRecordMapper.buyGood(1,3000,"apple"));
    }



}
