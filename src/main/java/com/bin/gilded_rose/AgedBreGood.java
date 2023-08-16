package com.bin.gilded_rose;

public class AgedBreGood extends Good {
    public AgedBreGood(String name, int quality, int sellIn) {
        super(name, quality, sellIn);
    }

    @Override
    public void updateByDay() {
        addQuality();
        decreaseSellIn();
        if (isExpired()) {
            addQuality();
        }
    }

}
