package io.justedlev.commons.jtc4mm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

import java.sql.Date;
import java.time.LocalDate;

class SqlDateToLocalDateTest {
    static ModelMapper modelMapper = new ModelMapper();
    static SqlDateToLocalDate converter = new SqlDateToLocalDate();

    @BeforeAll
    static void setUp() {
        modelMapper.addConverter(converter);
    }

    private LocalDate convert(Date source) {
        return modelMapper.map(source, LocalDate.class);
    }

    @Test
    void convert() {
        var expected = LocalDate.now();
        var value = Date.valueOf(expected);
        var actual = convert(value);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void convertInvalidSource() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> convert(null));
    }

}