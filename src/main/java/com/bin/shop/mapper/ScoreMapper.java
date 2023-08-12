package com.bin.shop.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bin.shop.entity.SysUser;
import org.apache.ibatis.annotations.Param;

public interface ScoreMapper extends BaseMapper<SysUser> {

    int updateUserScore(@Param("userId") int userId, @Param("score") int score);

}
