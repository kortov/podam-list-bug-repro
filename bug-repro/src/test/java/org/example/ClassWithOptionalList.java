package org.example;

import java.util.List;
import java.util.Optional;

public class ClassWithOptionalList {
    private final Optional<List<String>> nestedListOpt;

    public ClassWithOptionalList(
        Optional<List<String>> nestedListOpt
    ) {
        this.nestedListOpt = nestedListOpt;
    }

    public Optional<List<String>> getNestedListOpt() {
        return nestedListOpt;
    }

}
