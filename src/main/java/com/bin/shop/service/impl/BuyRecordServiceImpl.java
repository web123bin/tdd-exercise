package com.bin.shop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bin.shop.entity.BuyRecord;
import com.bin.shop.entity.SysUser;
import com.bin.shop.mapper.BuyRecordMapper;
import com.bin.shop.mapper.UserMapper;
import com.bin.shop.service.IBuyRecordService;
import com.bin.shop.service.IScoreService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * <p>
 * 购买记录 服务实现类
 * </p>
 *
 * @author bin
 * @since 2023-08-09
 */
@Service
public class BuyRecordServiceImpl extends ServiceImpl<BuyRecordMapper, BuyRecord> implements IBuyRecordService {

    @Resource
    private IScoreService scoreService;
    @Resource
    private UserMapper userMapper;
    @Resource
    private BuyRecordMapper buyRecordMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int buyGood(int userId, int money, String goodName) {
        SysUser sysUser = userMapper.selectById(userId);
        if (Objects.isNull(sysUser)) {
            throw new RuntimeException("用戶不存在");
        }
        int score = scoreService.calcSore(money);
        scoreService.updateUserScore(userId, score);

        Integer totalUseMoney = sysUser.getTotalUseMoney() + money;
        Integer remainMoney = sysUser.getRemainMoney() - money;
        sysUser.setTotalUseMoney(totalUseMoney);
        sysUser.setRemainMoney(remainMoney);
        userMapper.updateById(sysUser);

        return buyRecordMapper.buyGood(userId, money, goodName);
    }
}
