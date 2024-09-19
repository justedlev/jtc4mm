package io.justedlev.commons.jtc4mm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

import java.math.BigDecimal;

class BigDecimalToFloatTest {
    final ModelMapper modelMapper = new ModelMapper();
    final BigDecimal expected = BigDecimal.ONE;

    @BeforeEach
    void setUp() {
        modelMapper.addConverter(new BigDecimalToFloat());
    }

    @Test
    void convert() {
        var actual = modelMapper.map(expected, Float.class);

        Assertions.assertNotNull(actual);
        Assertions.assertEquals(1.0F, actual);
    }
}