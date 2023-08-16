package com.bin.gilded_rose;

public abstract class Good {
    private final String name;
    protected int quality;
    protected int sellIn;

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

    abstract void updateByDay();

    protected boolean isExpired() {
        return sellIn < 0;
    }

    protected void decreaseSellIn() {
        sellIn = sellIn -1;
    }

    protected void addQuality() {
        if(quality < 50) {
            quality = quality + 1;
        }
    }

    protected void decreaseQuality() {
        if(quality > 0) {
            quality = quality - 1;
        }
    }
}
