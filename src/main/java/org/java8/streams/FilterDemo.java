package org.java8.streams;

import static java.util.stream.Collectors.toList;
import static org.apache.commons.lang3.StringUtils.contains;

import java.util.List;

public class FilterDemo {
    public List<String> filterOut(List<String> lines, String value) {
        return lines.stream().filter(it -> !contains(it, value)).collect(toList());
    }
}
