package com.bin.shop.service.impl;

import com.bin.shop.entity.RechargeRecord;
import com.bin.shop.mapper.RechargeRecordMapper;
import com.bin.shop.service.IRechargeRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

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

    @Override
    public int addMoney(int id, int money) {
        return rechargeRecordMapper.addMoney(id,money);
    }
}
