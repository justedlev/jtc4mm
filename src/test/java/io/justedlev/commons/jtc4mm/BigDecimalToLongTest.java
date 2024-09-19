package io.justedlev.commons.jtc4mm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

import java.math.BigDecimal;

class BigDecimalToLongTest {
    final ModelMapper modelMapper = new ModelMapper();
    final BigDecimal expected = BigDecimal.ONE;

    @BeforeEach
    void setUp() {
        modelMapper.addConverter(new BigDecimalToLong());
    }

    @Test
    void convert() {
        final var actual = modelMapper.map(expected, Long.class);

        Assertions.assertNotNull(actual);
        Assertions.assertEquals(1L, actual);
    }
}