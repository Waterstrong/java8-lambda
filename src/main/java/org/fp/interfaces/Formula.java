package org.fp.interfaces;

public interface Formula {
    double calculate(double value);

    default double doDouble(double value) {
        return Math.pow(value, 2);
    }
}
