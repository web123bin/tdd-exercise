package com.bin.refactor;

import java.util.List;

public class Order {
    private final Customer customer;
    private final StringBuilder result = new StringBuilder();
    List<LineItem> lineItems;

    public Order(String customerName, String customerAddress, List<LineItem> lineItems) {
        this.customer = new Customer(customerName, customerAddress);
        this.lineItems = lineItems;
    }

    double calculateTotalSalesTax() {
        double totalSalesTax = 0d;
        for (LineItem lineItem : lineItems) {
            totalSalesTax += lineItem.calculateTotalSalesTax();
        }
        return totalSalesTax;
    }

    double calculateTotalAmountWithTax() {
        double totalAmountWithTax = 0d;
        for (LineItem lineItem : lineItems) {
            totalAmountWithTax += lineItem.calculateTotalAmountWithTax();
        }
        return totalAmountWithTax;
    }

    public String stateLineItems() {
        for (LineItem lineItem : lineItems) {
            result.append(lineItem.state());
        }
        return result.toString();
    }

    StringBuilder stateTotalAmountWithTax() {
        return result.append("Total Amount").append('\t').append(calculateTotalAmountWithTax());
    }

    StringBuilder stateTotalSalesTax() {
        return result.append("Sales Tax").append('\t').append(calculateTotalSalesTax());
    }

    String state() {
        return customer.getCustomerName() +
                customer.getCustomerAddress() +
                stateLineItems() +
                stateTotalSalesTax() +
                stateTotalAmountWithTax();
    }
}
