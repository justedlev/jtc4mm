package io.justedlev.commons.jtc4mm;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Optional;

/**
 * The class is implementation of the {@link Converter}&lt;{@link Instant}, {@link LocalDateTime}&gt;
 * and just will convert the {@link Instant}
 * to the {@link LocalDateTime} using the {@link LocalDateTime#ofInstant(Instant, ZoneId)} method
 * if the source not null, another will return the null value
 *
 * @author Edward Lukashevits
 * @since 0.0.1
 */
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class InstantToLocalDateTime implements Converter<Instant, LocalDateTime> {
    private ZoneId zoneId = ZoneId.systemDefault();

    @Override
    public LocalDateTime convert(MappingContext<Instant, LocalDateTime> mappingContext) {
        return Optional.of(mappingContext)
                .map(MappingContext::getSource)
                .map(instant -> LocalDateTime.ofInstant(instant, zoneId))
                .orElse(null);
    }
}
