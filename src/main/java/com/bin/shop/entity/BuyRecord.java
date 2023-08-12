package com.bin.shop.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 购买记录
 * </p>
 *
 * @author bin
 * @since 2023-08-09
 */
@Getter
@Setter
@TableName("buy_record")
public class BuyRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Integer id;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 购买商品
     */
    private String goodName;

    /**
     * 消费金额
     */
    private Integer useMoney;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 备注
     */
    private String remark;
}
