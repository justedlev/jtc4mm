package io.justedlev.commons.jtc4mm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

class LocalDateToTimestampTest {
    static ModelMapper modelMapper = new ModelMapper();
    LocalDate localDate = LocalDate.now();
    LocalTime localTime = LocalTime.MIN;

    @BeforeAll
    static void beforeAll() {
        modelMapper.addConverter(new LocalDateToTimestamp());
    }

    @Test
    void convert() {
        var actual = modelMapper.map(localDate, Timestamp.class);

        Assertions.assertNotNull(actual);
        Assertions.assertEquals(LocalDateTime.of(localDate, localTime), actual.toLocalDateTime());
    }
}