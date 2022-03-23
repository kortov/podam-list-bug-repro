package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;


class OptionalTest {
    private static final PodamFactory podamFactory = new PodamFactoryImpl();

    @Test
    void manufactureNestedClassWithOptional_PodamGenerated_Ok() {
        final NestedClassWithOptional sut = podamFactory.manufacturePojoWithFullData(NestedClassWithOptional.class);
        Assertions.assertTrue(sut.getPrimitive().get() instanceof Integer);
        Assertions.assertTrue(sut.getNestedField().get().getField().get() instanceof String);
        Assertions.assertTrue(sut.getNestedList().get(0) instanceof Integer);
    }

    @Test
    void manufactureClassWithOptionalList_PodamGenerated_Fail() {
        final ClassWithOptionalList sut = podamFactory.manufacturePojoWithFullData(ClassWithOptionalList.class);
        Assertions.assertTrue(sut.getNestedListOpt().get().get(0) instanceof Object);
        // fails
        Assertions.assertTrue(sut.getNestedListOpt().get().get(0) instanceof String);
    }

}