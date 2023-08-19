package com.gildedrose;

public class Item {

    public String name;
    public int sellIn;
    public int quality;

    protected Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    void passOneDay() {
        updateSellInDays();
        updateQuality();

        if (isExpired()) {
            updateQualityAfterExpiration();
        }
    }

    protected void updateQuality() {
        decreaseQuality();
    }

    protected void updateQualityAfterExpiration() {
        decreaseQuality();
    }

    protected void updateSellInDays() {
        sellIn = sellIn - 1;
    }

    protected void decreaseQuality() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    private boolean isExpired() {
        return sellIn < 0;
    }

    protected void increaseQuality() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }
}
