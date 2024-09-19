package io.justedlev.commons.jtc4mm;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Optional;

/**
 * The class is implementation of the {@link Converter}&lt;{@link Date}, {@link LocalDateTime}&gt;
 * and just will convert the {@link Instant} using the {@link Date#toInstant()} method,
 * to the {@link LocalDateTime} using the {@link Timestamp#from(Instant)} method
 * if the source not null, another will return the null value
 *
 * @author Edward Lukashevits
 * @since 0.0.1
 */
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class DateToLocalDateTime implements Converter<Date, LocalDateTime> {
    private ZoneId zoneId = ZoneId.systemDefault();

    /**
     * @param mappingContext of current mapping process 
     * @return {@link LocalDateTime}
     */
    @Override
    public LocalDateTime convert(MappingContext<Date, LocalDateTime> mappingContext) {
        return Optional.of(mappingContext)
                .map(MappingContext::getSource)
                .map(Date::toInstant)
                .map(instant -> LocalDateTime.ofInstant(instant, zoneId))
                .orElse(null);
    }
    
}
