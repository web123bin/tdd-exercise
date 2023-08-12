package com.bin.shop.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bin.shop.entity.SysUser;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author bin
 * @since 2023-08-09
 */
public interface UserMapper extends BaseMapper<SysUser> {

    int updateUserMoney(@Param("userId") int userId, @Param("totalAddMoney") Integer totalAddMoney, @Param("remainMoney") Integer remainMoney);

}
