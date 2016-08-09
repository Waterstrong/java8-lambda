package org.fp.lambda;

import static java.util.Collections.sort;

import java.util.List;

public class SortDemo {

    public List<String> sortByDictAsc(List<String> lines) {
        sort(lines, (first, second) -> first.compareTo(second));
        return lines;
    }
}
