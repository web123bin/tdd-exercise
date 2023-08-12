package com.bin.shop.controller;

import com.bin.shop.entity.SysUser;
import com.bin.shop.service.IUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
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

    @Resource
    private IUserService userService;

    @PostMapping
    public Map<String, Object> addUser(SysUser sysUser) {
        userService.addUser(sysUser);

        Map<String, Object> result = new HashMap<>();
        result.put("success", true);
        result.put("message", "新增成功!");
        return result;
    }

    @GetMapping
    public Map<String, Object> getUser(Integer userId) {
        SysUser user = userService.getUser(userId);

        Map<String, Object> result = new HashMap<>();
        result.put("success", true);
        result.put("data", user);
        return result;
    }

}
