package io.justedlev.commons.jtc4mm;

import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Optional;

public class SqlDateToLocalDate implements Converter<java.sql.Date, LocalDate> {
    @Override
    public LocalDate convert(MappingContext<Date, LocalDate> context) {
        return Optional.of(context)
                .map(MappingContext::getSource)
                .map(Date::toLocalDate)
                .orElse(null);
    }
}
