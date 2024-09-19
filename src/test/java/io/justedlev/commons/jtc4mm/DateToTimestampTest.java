package io.justedlev.commons.jtc4mm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

import java.sql.Timestamp;
import java.util.Date;

class DateToTimestampTest {
    static ModelMapper modelMapper = new ModelMapper();
    Date date = new Date();

    @BeforeAll
    static void beforeAll() {
        modelMapper.addConverter(new DateToTimestamp());
    }

    @Test
    void convert() {
        var actual = modelMapper.map(date, Timestamp.class);

        Assertions.assertNotNull(actual);
        Assertions.assertEquals(date.getTime(), actual.getTime());
        Assertions.assertEquals(date.toInstant(), actual.toInstant());
    }
}