package com.gildedrose.items;

import com.gildedrose.Item;

public class Conjured extends Item {
    public Conjured(int sellIn, int quality) {
        super("Conjured Mana Cake", sellIn, quality);
    }

    @Override
    protected void updateQualityAfterExpiration() {
        decreaseQuality();
    }

    @Override
    protected void updateQuality() {
        decreaseQuality();
    }

    @Override
    protected void decreaseQuality() {
        quality = quality - 2;
        if (quality < 1) {
            quality = 0;
        }
    }

}
