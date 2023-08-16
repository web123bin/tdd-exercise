package com.bin.gilded_rose;

public class Good {
    private final String name;
    private int quality;
    private int sellIn;

    public Good(String name, int quality, int sellIn) {
        this.name = name;
        this.quality = quality;
        this.sellIn = sellIn;
    }

    public String getName() {
        return name;
    }

    public int getQuality() {
        return quality;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void updateByDay() {
        if("Aged Brie".equals(name)) {
            addQuality();
            decreaseSellIn();
            if(sellIn < 0) {
                addQuality();
            }
            return;
        }

        decreaseQuality();
        decreaseSellIn();

        if(sellIn < 0) {
            decreaseQuality();
        }
    }

    private void decreaseSellIn() {
        sellIn = sellIn -1;
    }

    private void addQuality() {
        if(quality < 50) {
            quality = quality + 1;
        }
    }

    private void decreaseQuality() {
        if(quality > 0) {
            quality = quality - 1;
        }
    }
}
