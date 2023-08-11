package com.bin.shop.mapper;

import com.bin.shop.entity.BuyRecord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 购买记录 Mapper 接口
 * </p>
 *
 * @author bin
 * @since 2023-08-09
 */
public interface BuyRecordMapper extends BaseMapper<BuyRecord> {

    int buyGood(int id, int money, String goodName);

}
