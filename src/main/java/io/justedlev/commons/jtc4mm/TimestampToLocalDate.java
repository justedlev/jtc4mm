package io.justedlev.commons.jtc4mm;

import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

/**
 * The class is implementation of the {@link Converter}&lt;{@link Timestamp}, {@link LocalDate}&gt;
 * and just will convert the {@link Timestamp} to the {@link LocalDate}
 * using the {@link Timestamp#toLocalDateTime()} and {@link LocalDateTime#toLocalDate()}
 * if the source not null, another will return the null value
 *
 * @author Edward Lukashevits
 * @since 0.0.1
 */
public class TimestampToLocalDate implements Converter<Timestamp, LocalDate> {
    @Override
    public LocalDate convert(MappingContext<Timestamp, LocalDate> context) {
        return Optional.of(context)
                .map(MappingContext::getSource)
                .map(Timestamp::toLocalDateTime)
                .map(LocalDateTime::toLocalDate)
                .orElse(null);
    }
}
