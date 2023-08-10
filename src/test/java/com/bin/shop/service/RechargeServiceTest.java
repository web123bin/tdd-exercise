package com.bin.shop.service;

import com.bin.shop.mapper.RechargeRecordMapper;
import com.bin.shop.service.impl.RechargeRecordServiceImpl;
import com.bin.shop.utils.ReflectionTddUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RechargeServiceTest {

    private IRechargeRecordService rechargeRecordService;
    private RechargeRecordMapper rechargeRecordMapper;

    @BeforeEach
    public void before() throws NoSuchFieldException, IllegalAccessException {
        rechargeRecordMapper = mock(RechargeRecordMapper.class);
        rechargeRecordService = new RechargeRecordServiceImpl();
        ReflectionTddUtils.setFieldValue(rechargeRecordService,"rechargeRecordMapper",rechargeRecordMapper);
    }

   @Test
   public void addMoney() {
        when(rechargeRecordMapper.addMoney(1, 1000)).thenReturn(1);

        int update = rechargeRecordService.addMoney(1,1000);

       Assertions.assertEquals(1,update);
   }

}
