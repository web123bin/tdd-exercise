package com.bin.gilded_rose;

public class BackstagePassGood extends Good {
    public BackstagePassGood(String name, int quality, int sellIn) {
        super(name, quality, sellIn);
    }

    @Override
    public void updateByDay() {
        decreaseSellIn();
        if (sellIn <= 0) {
            quality = 0;
            return;
        }
        addQuality();
        if (sellIn <= 10) {
            addQuality();
        }
        if (sellIn <= 5) {
            addQuality();
        }
    }

}
