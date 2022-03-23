package org.example;

import java.util.Optional;

public class SimpleClass {
    private final Optional<String> field;

    public SimpleClass(Optional<String> field) {
        this.field = field;
    }

    public Optional<String> getField() {
        return field;
    }
}
