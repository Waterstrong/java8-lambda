package org.fp.interfaces;

public class FunctionalDemo {
    public Integer call(String value) {
        Converter<Integer, String> converter = Integer::valueOf;
        return converter.convert(value);
    }
}
