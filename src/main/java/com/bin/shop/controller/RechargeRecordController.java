package com.bin.shop.controller;

import com.bin.shop.service.IRechargeRecordService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 充值记录 前端控制器
 * </p>
 *
 * @author bin
 * @since 2023-08-10
 */
@RestController
@RequestMapping("/shop/recharge-record")
public class RechargeRecordController {

    @Resource
    private IRechargeRecordService rechargeRecordService;

    @PostMapping
    public Map<String, Object> addMoney(int userId, int addMoney) {
        rechargeRecordService.addMoney(userId, addMoney);

        Map<String, Object> result = new HashMap<>();
        result.put("success", true);
        result.put("message", "充值成功!");
        return result;
    }

}
