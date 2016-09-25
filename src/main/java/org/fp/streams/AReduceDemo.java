package org.fp.streams;

import static java.lang.Integer.MIN_VALUE;

import java.util.List;

public class AReduceDemo {
    public Integer sum(List<Integer> numbers) {
        return numbers.stream().reduce(0, (first, second) -> first + second);
    }

    public Integer mul(List<Integer> numbers) {
        return numbers.stream().reduce(1, (first, second) -> first * second);
    }

    public Integer max(List<Integer> numbers) {
        return numbers.stream().reduce(MIN_VALUE, Integer::max);
    }
}
