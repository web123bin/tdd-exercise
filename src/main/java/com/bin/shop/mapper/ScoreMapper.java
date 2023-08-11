package com.bin.shop.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bin.shop.entity.User;
import org.apache.ibatis.annotations.Param;

public interface ScoreMapper extends BaseMapper<User> {

    int updateUserScore(@Param("id") int id, @Param("money") int money);

}
