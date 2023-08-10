package com.bin.shop.service;

import com.bin.shop.mapper.BuyRecordMapper;
import com.bin.shop.service.impl.BuyRecordServiceImpl;
import com.bin.shop.utils.ReflectionTddUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BuyRecordControllerTest {

    private IBuyRecordService buyRecordService;
    private BuyRecordMapper buyRecordMapper;

    @BeforeEach
    public void before() throws NoSuchFieldException, IllegalAccessException {
        buyRecordMapper = mock(BuyRecordMapper.class);
        buyRecordService = new BuyRecordServiceImpl();
        ReflectionTddUtils.setFieldValue(buyRecordService,"buyRecordMapper",buyRecordMapper);
    }

    @Test
    public void buyGood() {
        when(buyRecordMapper.buyGood(1,3000,"apple")).thenReturn(1);

        int result = buyRecordService.buyGood(1,3000,"apple");

        Assertions.assertEquals(1,result);
    }

}
