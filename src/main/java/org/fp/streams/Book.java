package org.fp.streams;

import static java.lang.Integer.MIN_VALUE;

public class Book {
    private final int id;
    private final String name;
    private final double price;

    public Book() {
        this.id = MIN_VALUE;
        this.name = "unknown";
        this.price = 0d;
    }

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
        this.price = 0;
    }

    public Book(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
