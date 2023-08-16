package com.bin.gilded_rose;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AgedBrieTest {

    @Test
    void should_quality_is_50_and_sell_in_decrease_by_1_when_update_given_in_sell_and_quality_is_49() {
        Good result = new Good("Aged Brie",49,10);

        result.updateByDay();

        Assertions.assertEquals(50,result.getQuality());
        Assertions.assertEquals(9,result.getSellIn());
    }

    @Test
    void should_quality_is_50_and_sell_in_decrease_by_1_when_update_given_in_sell_and_quality_is_50() {
        Good result = new Good("Aged Brie",50,10);

        result.updateByDay();

        Assertions.assertEquals(50,result.getQuality());
        Assertions.assertEquals(9,result.getSellIn());
    }

    @Test
    void should_quality_is_50_and_sell_in_decrease_by_1_when_update_given_out_sell_and_quality_is_48() {
        Good result = new Good("Aged Brie",48,0);

        result.updateByDay();

        Assertions.assertEquals(50,result.getQuality());
        Assertions.assertEquals(-1,result.getSellIn());
    }

    @Test
    void should_quality_is_50_and_sell_in_decrease_by_1_when_update_given_out_sell_and_quality_is_49() {
        Good result = new Good("Aged Brie",49,0);

        result.updateByDay();

        Assertions.assertEquals(50,result.getQuality());
        Assertions.assertEquals(-1,result.getSellIn());
    }

}
