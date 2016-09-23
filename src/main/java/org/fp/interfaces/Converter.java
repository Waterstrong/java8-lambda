package org.fp.interfaces;

@FunctionalInterface
public interface Converter<T, F> {
    T convert(F from);
}
