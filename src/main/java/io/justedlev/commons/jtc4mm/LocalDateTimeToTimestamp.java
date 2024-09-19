package io.justedlev.commons.jtc4mm;

import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Optional;

/**
 * The class is implementation of the {@link Converter}&lt;{@link LocalDateTime}, {@link Timestamp}&gt;
 * and just will convert the {@link LocalDateTime}
 * to the {@link Timestamp} using the {@link Timestamp#valueOf(LocalDateTime)} method
 * if the source not null, another will return the null value
 *
 * @author Edward Lukashevits
 * @since 0.0.1
 */
public class LocalDateTimeToTimestamp implements Converter<LocalDateTime, Timestamp> {
    @Override
    public Timestamp convert(MappingContext<LocalDateTime, Timestamp> context) {
        return Optional.of(context)
                .map(MappingContext::getSource)
                .map(Timestamp::valueOf)
                .orElse(null);
    }
}
