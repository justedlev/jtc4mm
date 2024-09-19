package io.justedlev.commons.jtc4mm;

import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Optional;

/**
 * The class is implementation of the {@link Converter}&lt;{@link Timestamp}, {@link LocalDateTime}&gt;
 * and just will convert the {@link Timestamp} to the {@link LocalDateTime}
 * using the {@link Timestamp#toLocalDateTime()}
 * if the source not null, another will return the null value
 *
 * @author Edward Lukashevits
 * @since 0.0.1
 */
public class TimestampToLocalDateTime implements Converter<Timestamp, LocalDateTime> {
    @Override
    public LocalDateTime convert(MappingContext<Timestamp, LocalDateTime> context) {
        return Optional.of(context)
                .map(MappingContext::getSource)
                .map(Timestamp::toLocalDateTime)
                .orElse(null);
    }
}
