package org.example;

import java.util.List;
import java.util.Optional;

public class NestedClassWithOptional {
    private final Optional<Integer> primitive;
    private final Optional<SimpleClass> nestedField;
    private final List<Integer> nestedList;

    public NestedClassWithOptional(
        Optional<Integer> primitive,
        Optional<SimpleClass> nestedField,
        List<Integer> nestedList
    ) {
        this.primitive = primitive;
        this.nestedField = nestedField;
        this.nestedList = nestedList;
    }

    public Optional<Integer> getPrimitive() {
        return primitive;
    }

    public Optional<SimpleClass> getNestedField() {
        return nestedField;
    }

    public List<Integer> getNestedList() {
        return nestedList;
    }
}
