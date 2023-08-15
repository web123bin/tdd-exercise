package com.bin.refactor;

public class Customer {

    private final String name;
    private final String address;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    String stateCustomer() {
        return getName() +
                getAddress();
    }
}
