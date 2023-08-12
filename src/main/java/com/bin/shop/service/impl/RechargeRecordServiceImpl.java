package com.bin.shop.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bin.shop.entity.RechargeRecord;
import com.bin.shop.mapper.RechargeRecordMapper;
import com.bin.shop.service.IRechargeRecordService;
import com.bin.shop.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * <p>
 * 充值记录 服务实现类
 * </p>
 *
 * @author bin
 * @since 2023-08-09
 */
@Service
public class RechargeRecordServiceImpl extends ServiceImpl<RechargeRecordMapper, RechargeRecord> implements IRechargeRecordService {

    @Resource
    private RechargeRecordMapper rechargeRecordMapper;

    @Resource
    private IUserService userService;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int addMoney(int userId, int money) {
        int update = rechargeRecordMapper.addMoney(userId, money);
        userService.updateUserMoney(userId, money);
        return update;
    }

}
