package com.bin.shop.mapper;

import com.baomidou.mybatisplus.test.autoconfigure.MybatisPlusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

@MybatisPlusTest
class BuyRecordMapperTest {

    @Resource
    private BuyRecordMapper buyRecordMapper;

    @Test
    void buyGood() {
        int update = buyRecordMapper.buyGood(1, 2000, "apple");

        Assertions.assertEquals(1, update);
    }
}