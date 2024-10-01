package io.justedlev.commons.jtc4mm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

import java.sql.Date;
import java.time.LocalDate;

class LocalDateToSqlDateTest {
    static ModelMapper modelMapper = new ModelMapper();
    static LocalDateToSqlDate converter = new LocalDateToSqlDate();

    @BeforeAll
    static void setUp() {
        modelMapper.addConverter(converter);
    }

    private Date convert(LocalDate localDate) {
        return modelMapper.map(localDate, Date.class);
    }

    @Test
    void convert() {
        var value = LocalDate.now();
        var actual = convert(value);
        Assertions.assertEquals(Date.valueOf(value), actual);
    }

    @Test
    void convertInvalidSource() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> convert(null));
    }

}
