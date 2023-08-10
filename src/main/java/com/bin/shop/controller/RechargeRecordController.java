package com.bin.shop.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping
    public Map<String,Object> addMoney(int id,int addMoney) {
        Map<String,Object> result = new HashMap<>();

        result.put("success",true);
        result.put("message","充值成功!");
        return result;
    }

}
