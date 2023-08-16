package com.bin.gilded_rose;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BackstagePassTest {

    @Test
    void should_quality_is_50_and_sell_in_decrease_by_1_when_update_given_in_sell_and_above_10_and_quality_is_49() {
        Good result = new BackstagePassGood("Backstage Pass", 49, 11);

        result.updateByDay();

        Assertions.assertEquals(50, result.getQuality());
        Assertions.assertEquals(10, result.getSellIn());
    }

    @Test
    void should_quality_is_50_and_sell_in_decrease_by_1_when_update_given_in_sell_and_above_10_and_quality_is_50() {
        Good result = new BackstagePassGood("Backstage Pass", 50, 11);

        result.updateByDay();

        Assertions.assertEquals(50, result.getQuality());
        Assertions.assertEquals(10, result.getSellIn());
    }

    @Test
    void should_quality_is_50_and_sell_in_decrease_by_1_when_update_given_in_sell_and_above_8_and_quality_is_48() {
        Good result = new BackstagePassGood("Backstage Pass", 48, 8);

        result.updateByDay();

        Assertions.assertEquals(50, result.getQuality());
        Assertions.assertEquals(7, result.getSellIn());
    }

    @Test
    void should_quality_is_50_and_sell_in_decrease_by_1_when_update_given_in_sell_and_above_8_and_quality_is_49() {
        Good result = new BackstagePassGood("Backstage Pass", 49, 8);

        result.updateByDay();

        Assertions.assertEquals(50, result.getQuality());
        Assertions.assertEquals(7, result.getSellIn());
    }

    @Test
    void should_quality_is_50_and_sell_in_decrease_by_3_when_update_given_in_sell_and_above_3_and_quality_is_47() {
        Good result = new BackstagePassGood("Backstage Pass", 47, 3);

        result.updateByDay();

        Assertions.assertEquals(50, result.getQuality());
        Assertions.assertEquals(2, result.getSellIn());
    }

    @Test
    void should_quality_is_50_and_sell_in_decrease_by_3_when_update_given_in_sell_and_above_3_and_quality_is_49() {
        Good result = new BackstagePassGood("Backstage Pass", 49, 3);

        result.updateByDay();

        Assertions.assertEquals(50, result.getQuality());
        Assertions.assertEquals(2, result.getSellIn());
    }

    @Test
    void should_quality_is_0_and_sell_in_decrease_by_1_when_update_given_out_sell_and_above_0_and_quality_is_49() {
        Good result = new BackstagePassGood("Backstage Pass", 49, 0);

        result.updateByDay();

        Assertions.assertEquals(0, result.getQuality());
        Assertions.assertEquals(-1, result.getSellIn());
    }

}
