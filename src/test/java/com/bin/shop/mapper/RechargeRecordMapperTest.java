package com.bin.shop.mapper;

import com.baomidou.mybatisplus.test.autoconfigure.MybatisPlusTest;
import com.bin.shop.entity.RechargeRecord;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

@MybatisPlusTest
class RechargeRecordMapperTest {

    @Resource
    private RechargeRecordMapper rechargeRecordMapper;

    @Test
    public void addMoney() {
        RechargeRecord rechargeRecord = new RechargeRecord();
        rechargeRecord.setUserId(1);
        rechargeRecord.setAddMoney(1000);

        int update = rechargeRecordMapper.insert(rechargeRecord);

        Assertions.assertEquals(1, update);
    }

}