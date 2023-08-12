package com.bin.shop.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bin.shop.entity.BuyRecord;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 购买记录 Mapper 接口
 * </p>
 *
 * @author bin
 * @since 2023-08-09
 */
public interface BuyRecordMapper extends BaseMapper<BuyRecord> {

    int buyGood(@Param("userId") int id, @Param("userMoney") int userMoney, @Param("goodName") String goodName);

}
