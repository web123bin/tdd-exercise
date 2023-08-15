package com.bin.refactor;

import java.util.List;

public class Order {

    private final Customer customer;
    private final List<LineItem> lineItems;

    public Order(String customerName, String address, List<LineItem> lineItems) {
        this.customer = new Customer(customerName,address);
        this.lineItems = lineItems;
    }

    private double calculateTotalSalesTax() {
        return lineItems.stream().mapToDouble(LineItem::calculateSalesTax).sum();
    }

    private double calculateTotalAmountWithTax() {
        return lineItems.stream().mapToDouble(LineItem::calculateAmountWithTax).sum();
    }

    private String stateTotalAmountWithTax() {
        return "Total Amount" + '\t' + calculateTotalAmountWithTax();
    }

    private String stateTotalSalesTax() {
        return "Sales Tax" + '\t' + calculateTotalSalesTax();
    }

    private String stateLineItems() {
        StringBuilder output = new StringBuilder();
        for (LineItem lineItem : lineItems) {
            output.append(lineItem.state());
        }
        return output.toString();
    }

    public String generateReceipt() {
        return customer.stateCustomer() +
                stateLineItems() +
                stateTotalSalesTax() +
                stateTotalAmountWithTax();
    }

}
