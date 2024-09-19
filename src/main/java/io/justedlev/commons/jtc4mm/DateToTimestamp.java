package io.justedlev.commons.jtc4mm;

import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Date;
import java.util.Optional;

/**
 * The class is implementation of the {@link Converter}&lt;{@link Date}, {@link Timestamp}&gt;
 * and just will convert the {@link Date} using the {@link Date#toInstant()} method,
 * to the {@link Timestamp} using the {@link Timestamp#from(Instant)} method
 * if the source not null, another will return the null value
 *
 * @author Edward Lukashevits
 * @since 0.0.1
 */
public class DateToTimestamp implements Converter<Date, Timestamp> {
    @Override
    public Timestamp convert(MappingContext<Date, Timestamp> context) {
        return Optional.of(context)
                .map(MappingContext::getSource)
                .map(Date::toInstant)
                .map(Timestamp::from)
                .orElse(null);
    }
}
