package com.bin.shop.controller;

import base.ControllerTestBase;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class ConsumeControllerTest extends ControllerTestBase {
    @Override
    public void beforeTest() {

    }

    @Override
    public void afterTest() {

    }

    @Test
    public void buyGood() throws Exception {
        post("/buyGood",
                new HashMap<String, String>() {{
                    put("id", "1");
                    put("goodName","apple");
                    put("useMoney","1000");
                }},
                new HashMap<String, Object>() {
                    {
                        put("$.success", "true");
                    }
                }
        );
    }

}
