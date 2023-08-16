package com.bin.gilded_rose;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GoodTest {

    @Test
    void should_quality_and_sell_in_decrease_by_1_when_update_given_in_sell_and_quality_between_0_50() {
        Good result = new Good("Regular",50,10);

        result.updateByDay();

        Assertions.assertEquals(49,result.getQuality());
        Assertions.assertEquals(9,result.getSellIn());
    }

    @Test
    void should_quality_is_0_and_sell_in_decrease_by_1_when_update_given_in_sell_and_quality_is_0() {
        Good result = new Good("Regular",0,10);

        result.updateByDay();

        Assertions.assertEquals(0,result.getQuality());
        Assertions.assertEquals(9,result.getSellIn());
    }

    @Test
    void should_quality_is_48_and_sell_in_decrease_by_1_when_update_given_out_sell_and_quality_is_50() {
        Good result = new Good("Regular",50,0);

        result.updateByDay();

        Assertions.assertEquals(48,result.getQuality());
        Assertions.assertEquals(-1,result.getSellIn());
    }

    @Test
    void should_quality_is_0_and_sell_in_decrease_by_1_when_update_given_out_sell_and_quality_is_1() {
        Good result = new Good("Regular",1,0);

        result.updateByDay();

        Assertions.assertEquals(0,result.getQuality());
        Assertions.assertEquals(-1,result.getSellIn());
    }

}
