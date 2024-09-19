package io.justedlev.commons.jtc4mm;

import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Optional;

/**
 * The class is implementation of the {@link Converter}&lt;{@link BigDecimal}, {@link Integer}&gt;
 * and just will convert the {@link LocalDateTime} to the {@link Timestamp}
 * using the {@link BigDecimal#intValue()}
 * if the source not null, another will return the null value
 *
 * @author Edward Lukashevits
 * @since 0.0.1
 */
public class BigDecimalToInteger implements Converter<BigDecimal, Integer> {

    /**
     * @param context of current mapping process
     * @return {@link Integer}
     */
    @Override
    public Integer convert(MappingContext<BigDecimal, Integer> context) {
        return Optional.of(context)
                .map(MappingContext::getSource)
                .map(BigDecimal::intValue)
                .orElse(null);
    }

}
