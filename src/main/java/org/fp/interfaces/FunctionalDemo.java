package org.fp.interfaces;

public class FunctionalDemo {
    public Integer call(String value) {
        Converter<String, Integer> converter = Integer::valueOf;
        return converter.convert(value);
    }
}
