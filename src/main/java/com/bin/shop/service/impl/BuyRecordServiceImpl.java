package com.bin.shop.service.impl;

import com.bin.shop.entity.BuyRecord;
import com.bin.shop.mapper.BuyRecordMapper;
import com.bin.shop.service.IBuyRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
    private BuyRecordMapper buyRecordMapper;

    @Override
    public int buyGood(int id, int money, String goodName) {
        return buyRecordMapper.buyGood(id,money,goodName);
    }
}
