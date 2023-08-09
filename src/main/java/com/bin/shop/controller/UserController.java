package com.bin.shop.controller;

import com.bin.shop.entity.User;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author bin
 * @since 2023-08-09
 */
@RestController
@RequestMapping("/shop/user")
public class UserController {

    @PostMapping
    public Map<String,Object> addUser(User user) {
        Map<String,Object> result = new HashMap<>();

        result.put("success",true);
        result.put("message","新增成功!");
        return result;
    }

    @GetMapping
    public Map<String,Object> getUser(Integer id) {
        Map<String,Object> result = new HashMap<>();

        result.put("success",true);
        return result;
    }

}
