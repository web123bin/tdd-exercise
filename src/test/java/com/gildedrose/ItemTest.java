package com.gildedrose;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ItemTest {

    @Test
    public void should_double_increase_backstage_pass_value_when_getting_close_to_expiration() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 11, 20);
        item.passOneDay();
        Assertions.assertEquals(21, item.quality);
        item.passOneDay();
        Assertions.assertEquals(23, item.quality);
    }

}