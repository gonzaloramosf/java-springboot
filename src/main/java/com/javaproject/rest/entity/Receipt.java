package com.javaproject.rest.entity;

public class Receipt {
    String date;
    String product;
    int total;
    String direction;

    Client client = new Client();
    Products products = new Products();
}
