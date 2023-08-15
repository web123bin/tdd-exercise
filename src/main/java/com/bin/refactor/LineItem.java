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

	double calculateSalesTax() {
		return totalAmount() * .10;
	}

	double calculateAmountWithTax() {
		return totalAmount() + calculateSalesTax();
	}

	String stateLineItem() {
		return description +
				'\t' +
				price +
				'\t' +
				quantity +
				'\t' +
				totalAmount() +
				'\n';
	}
}