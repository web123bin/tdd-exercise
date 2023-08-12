package com.bin.shop.service;

import org.apache.ibatis.annotations.Param;

public interface IScoreService {

    int updateUserScore(@Param("userId") int userId, @Param("score") int score);

    int calcSore(int money);
}
