package org.fp.streams;

import static org.apache.commons.lang3.StringUtils.appendIfMissing;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {

    public List<String> addSuffix(List<String> lines, String suffix) {
        List<String> results = new ArrayList<>();
        lines.stream().forEach(it -> results.add(appendIfMissing(it, suffix)));
        return results;
    }

    public List<String> addSuffixWithLength(List<String> lines, String suffix) {
        List<String> results = new ArrayList<>();
        lines.stream()
                .filter(it -> it.length() > 3)
                .forEach(it -> results.add(appendIfMissing(it, suffix)));
        return results;
    }
}
