package com.bin.shop.mapper;

import com.baomidou.mybatisplus.test.autoconfigure.MybatisPlusTest;
import com.bin.shop.entity.SysUser;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

@MybatisPlusTest
class ScoreMapperTest {

    @Resource
    private ScoreMapper scoreMapper;

    @Test
    void updateUserScore() {
        SysUser sysUser = new SysUser();
        sysUser.setId(1);
        sysUser.setScore(900);
        scoreMapper.updateById(sysUser);
    }
}