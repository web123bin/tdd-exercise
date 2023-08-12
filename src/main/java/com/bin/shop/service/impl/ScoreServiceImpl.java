package com.bin.shop.service.impl;

import com.bin.shop.mapper.ScoreMapper;
import com.bin.shop.service.IScoreService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ScoreServiceImpl implements IScoreService {

    @Resource
    private ScoreMapper scoreMapper;

    @Override
    public int updateUserScore(int userId, int score) {
        return scoreMapper.updateUserScore(userId, score);
    }

    @Override
    public int calcSore(int money) {
        if (money <= 100) {
            return money;
        } else if (money <= 1000) {
            return calcSore(100) + (money - 100) * 2;
        }
        return calcSore(1000) + (money - 1000) * 3;
    }

}
