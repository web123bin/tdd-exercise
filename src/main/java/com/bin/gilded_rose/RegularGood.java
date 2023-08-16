package com.bin.gilded_rose;

public class RegularGood extends Good {
    public RegularGood(String name, int quality, int sellIn) {
        super(name, quality, sellIn);
    }

    @Override
    public void updateByDay() {
        decreaseQuality();
        decreaseSellIn();
        if (isExpired()) {
            decreaseQuality();
        }
    }

}
