package com.bin.shop.service;

import com.bin.shop.mapper.ScoreMapper;
import com.bin.shop.service.impl.ScoreServiceImpl;
import com.bin.shop.utils.ReflectionTddUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ScoreServiceTest {

    private IScoreService scoreService;
    private ScoreMapper scoreMapper;

    @BeforeEach
    public void before() throws NoSuchFieldException, IllegalAccessException {
        scoreService = new ScoreServiceImpl();
        scoreMapper = mock(ScoreMapper.class);
        ReflectionTddUtils.setFieldValue(scoreService,"scoreMapper",scoreMapper);
    }

    @Test
    public void updateUserScore() {
        when(scoreMapper.updateUserScore(1,3000)).thenReturn(1);

        int result = scoreService.updateUserScore(1,3000);

        Assertions.assertEquals(1,result);
    }

    @Test
    public void calcScore() {
        Assertions.assertEquals(80,scoreService.calcSore(80),"积分计算错误");
        Assertions.assertEquals(100 + (980 - 100) * 2,scoreService.calcSore(980),"积分计算错误");
        Assertions.assertEquals(100 + 900 * 2 + 980 * 3,scoreService.calcSore(1980),"积分计算错误");
    }

}
