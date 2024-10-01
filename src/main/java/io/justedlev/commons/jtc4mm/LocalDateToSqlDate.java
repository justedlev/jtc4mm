package io.justedlev.commons.jtc4mm;

import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Optional;

public class LocalDateToSqlDate implements Converter<LocalDate, Date> {
    @Override
    public Date convert(MappingContext<LocalDate, Date> context) {
        return Optional.of(context)
                .map(MappingContext::getSource)
                .map(Date::valueOf)
                .orElse(null);
    }
}
