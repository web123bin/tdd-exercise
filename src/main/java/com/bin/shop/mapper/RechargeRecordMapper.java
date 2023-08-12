package com.bin.shop.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bin.shop.entity.RechargeRecord;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 充值记录 Mapper 接口
 * </p>
 *
 * @author bin
 * @since 2023-08-09
 */
public interface RechargeRecordMapper extends BaseMapper<RechargeRecord> {

    int addMoney(@Param("userId") int userId, @Param("money") int money);

}
