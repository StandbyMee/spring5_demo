package com.practice.spring5;

public class Orders {
    private String name;
    private String address;

    public Orders(String name, String address) {
        this.name = name;
        this.address = address;
    }
    public void ordersTest() {
        System.out.println(name + "  " + address);
    }
}
