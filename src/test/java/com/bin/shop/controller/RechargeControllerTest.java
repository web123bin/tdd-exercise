package com.bin.shop.controller;

import base.ControllerTestBase;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class RechargeControllerTest extends ControllerTestBase {

    public static final String URI = "/shop/recharge-record";

    @Override
    public void beforeTest() {

    }

    @Override
    public void afterTest() {

    }

    @Test
    public void addMoney() throws Exception {
        post(URI,
                new HashMap<String, String>() {{
                    put("userId", "1");
                    put("addMoney", "1000");
                }},
                new HashMap<String, Object>() {
                    {
                        put("$.success", "true");
                    }
                }
        );
    }
}
