package com.bin.shop.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 购买记录 前端控制器
 * </p>
 *
 * @author bin
 * @since 2023-08-10
 */
@RestController
@RequestMapping("/shop/buy-record")
public class BuyRecordController {

    @PostMapping
    public Map<String, Object> buyGood(int id, int useMoney, String goodName) {
        Map<String, Object> result = new HashMap<>();

        result.put("success", true);
        result.put("message", "消费成功!");
        return result;
    }

}
