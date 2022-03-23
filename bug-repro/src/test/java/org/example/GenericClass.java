package org.example;

import java.util.Optional;

public class GenericClass<T> {
    private final Optional<T> field;

    public GenericClass(Optional<T> field) {
        this.field = field;
    }

    public Optional<T> getField() {
        return field;
    }
}
