package com.bin.gilded_rose;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SulfurasTest {

    @Test
    void should_quality_and_sell_in_stay_when_update_given_in_sell_and_quality_is_50() {
        Good result = new SulfurasGood("Sulfuras", 50, 10);

        result.updateByDay();

        Assertions.assertEquals(50, result.getQuality());
        Assertions.assertEquals(10, result.getSellIn());
    }

}
