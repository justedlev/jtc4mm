package io.justedlev.commons.jtc4mm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

class TimestampToLocalDateTest {
    static ModelMapper modelMapper = new ModelMapper();
    Timestamp timestamp = Timestamp.valueOf(LocalDateTime.now());

    @BeforeAll
    static void beforeAll() {
        modelMapper.addConverter(new TimestampToLocalDate());
    }

    @Test
    void convert() {
        var actual = modelMapper.map(timestamp, LocalDate.class);

        Assertions.assertNotNull(actual);
        Assertions.assertEquals(timestamp.toLocalDateTime().toLocalDate(), actual);
    }
}