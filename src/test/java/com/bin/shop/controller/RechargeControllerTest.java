package com.bin.shop.controller;

import base.ControllerTestBase;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class RechargeControllerTest extends ControllerTestBase {
    @Override
    public void beforeTest() {

    }

    @Override
    public void afterTest() {

    }

    @Test
    public void addMoney() throws Exception {
        post("/addMoney",
                new HashMap<String, String>() {{
                    put("id", "1");
                    put("addMoney","1000");
                }},
                new HashMap<String, Object>() {
                    {
                        put("$.success", "true");
                    }
                }
        );
    }
}
