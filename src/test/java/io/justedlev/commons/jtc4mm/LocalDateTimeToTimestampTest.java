package io.justedlev.commons.jtc4mm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

import java.sql.Timestamp;
import java.time.LocalDateTime;

class LocalDateTimeToTimestampTest {
    static ModelMapper modelMapper = new ModelMapper();
    LocalDateTime dateTime = LocalDateTime.now();

    @BeforeAll
    static void beforeAll() {
        modelMapper.addConverter(new LocalDateTimeToTimestamp());
    }

    @Test
    void convert() {
        var actual = modelMapper.map(dateTime, Timestamp.class);

        Assertions.assertNotNull(actual);
        Assertions.assertEquals(dateTime, actual.toLocalDateTime());
    }
}