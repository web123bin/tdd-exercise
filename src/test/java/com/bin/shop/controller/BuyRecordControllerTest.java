package com.bin.shop.controller;

import base.ControllerTestBase;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class BuyRecordControllerTest extends ControllerTestBase {

    public static final String URI = "/shop/buy-record";

    @Override
    public void beforeTest() {

    }

    @Override
    public void afterTest() {

    }

    @Test
    public void buyGood() throws Exception {
        post(URI,
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
