package io.justedlev.commons.jtc4mm;

import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Optional;

/**
 * The class is implementation of the {@link Converter}&lt;{@link Instant}, {@link Timestamp}&gt;
 * and just will convert the {@link Instant}
 * to the {@link Timestamp} using the {@link Timestamp#from(Instant)} method
 * if the source not null, another will return the null value
 *
 * @author Edward Lukashevits
 * @since 0.0.1
 */
public class InstantToTimestamp implements Converter<Instant, Timestamp> {
    @Override
    public Timestamp convert(MappingContext<Instant, Timestamp> context) {
        return Optional.of(context)
                .map(MappingContext::getSource)
                .map(Timestamp::from)
                .orElse(null);
    }
}
