package com.bin.shop.controller;

import base.ControllerTestBase;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class UserControllerTest extends ControllerTestBase {

    public static final String URI = "/shop/user";

    @Override
    public void beforeTest() {

    }

    @Override
    public void afterTest() {

    }

    @Test
    public void addUser() throws Exception {
        post(URI,
                new HashMap<String, String>() {{
                    put("username", "张三");
                    put("password", "123");
                }},
                new HashMap<String, Object>() {
                    {
                        put("$.success", true);
                        put("$.message", "新增成功!");
                    }
                }
        );
    }

    @Test
    public void getUser() throws Exception {
        get(URI,
                new HashMap<String, String>() {{
                    put("id", "1");
                }},
                new HashMap<String, Object>() {{
                    put("$.success", "true");
                }}
        );
    }
}
