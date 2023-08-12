package com.bin.shop.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bin.shop.entity.BuyRecord;

/**
 * <p>
 * 购买记录 服务类
 * </p>
 *
 * @author bin
 * @since 2023-08-09
 */
public interface IBuyRecordService extends IService<BuyRecord> {

    int buyGood(int userId, int money, String goodName);

}
