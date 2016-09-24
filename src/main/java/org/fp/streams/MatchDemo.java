package org.fp.streams;

import static org.apache.commons.lang3.StringUtils.containsIgnoreCase;

import java.util.List;

public class MatchDemo {
    public boolean anyMatch(List<String> lines) {
        return lines.stream().anyMatch(it -> containsIgnoreCase(it, "hello"));
    }
}
