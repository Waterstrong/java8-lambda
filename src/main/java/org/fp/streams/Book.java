package org.fp.streams;

import static java.lang.Integer.MIN_VALUE;

public class Book {
    private final Integer id;
    private final String name;
    private final Double price;

    public Book() {
        this.id = MIN_VALUE;
        this.name = "unknown";
        this.price = 0d;
    }

    public Book(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.price = 0d;
    }

    public Book(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
