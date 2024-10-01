package io.justedlev.commons.jtc4mm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.modelmapper.MappingException;
import org.modelmapper.ModelMapper;

import java.util.UUID;

class StringToUUIDTest {
    static ModelMapper modelMapper = new ModelMapper();
    static StringToUUID converter = new StringToUUID();

    @BeforeAll
    static void setUp() {
        modelMapper.addConverter(converter);
    }

    @Test
    void convert() {
        var uuid = UUID.randomUUID();
        var actual = modelMapper.map(uuid.toString(), UUID.class);
        Assertions.assertEquals(uuid, actual);
    }

    @Test
    void convertInvalid() {
        var ex = Assertions.assertThrows(
                MappingException.class,
                () -> modelMapper.map("incorrect uuid string", UUID.class)
        );
        Assertions.assertEquals(IllegalArgumentException.class, ex.getCause().getClass());
        Assertions.assertEquals("Invalid UUID string: incorrect uuid string", ex.getCause().getMessage());
    }

    @Test
    void convertLarge() {
        var ex = Assertions.assertThrows(
                MappingException.class,
                () -> modelMapper.map("its some large string that contains more then 36 chars", UUID.class),
                "UUID string too large"
        );
        Assertions.assertEquals(IllegalArgumentException.class, ex.getCause().getClass());
        Assertions.assertEquals("UUID string too large", ex.getCause().getMessage());
    }

}