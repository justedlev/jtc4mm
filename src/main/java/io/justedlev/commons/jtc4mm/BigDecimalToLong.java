package io.justedlev.commons.jtc4mm;

import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Optional;

/**
 * The class is implementation of the {@link Converter}&lt;{@link BigDecimal}, {@link Long}&gt;
 * and just will convert the {@link LocalDateTime} to the {@link Timestamp}
 * using the {@link BigDecimal#longValue()}
 * if the source not null, another will return the null value
 *
 * @author Edward Lukashevits
 * @since 0.0.1
 */
public class BigDecimalToLong implements Converter<BigDecimal, Long> {

    /**
     * @param context of current mapping process
     * @return {@link Long}
     */
    @Override
    public Long convert(MappingContext<BigDecimal, Long> context) {
        return Optional.of(context)
                .map(MappingContext::getSource)
                .map(BigDecimal::longValue)
                .orElse(null);
    }

}
