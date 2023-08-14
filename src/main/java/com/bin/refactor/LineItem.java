package com.bin.refactor;

public class LineItem {
    private final String description;
    private final double price;
    private final int quantity;

    public LineItem(String description, double price, int quantity) {
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    double totalAmount() {
        return price * quantity;
    }

    double calculateTotalSalesTax() {
        return totalAmount() * .10;
    }

    double calculateTotalAmountWithTax() {
        return totalAmount() + totalAmount() * .10;
    }

    public String state() {
        return description + '\t'
                + price + '\t'
                + quantity + '\t'
                + totalAmount() + '\n';
    }
}