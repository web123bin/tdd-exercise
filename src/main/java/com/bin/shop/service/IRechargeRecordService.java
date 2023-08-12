package com.bin.shop.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bin.shop.entity.RechargeRecord;

/**
 * <p>
 * 充值记录 服务类
 * </p>
 *
 * @author bin
 * @since 2023-08-09
 */
public interface IRechargeRecordService extends IService<RechargeRecord> {

    int addMoney(int userId, int money);

}
