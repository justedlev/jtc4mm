package io.justedlev.commons.jtc4mm;

import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;

import java.math.BigDecimal;
import java.util.Optional;

/**
 * The class is implementation of the {@link Converter}&lt;{@link Long}, {@link BigDecimal}&gt;
 * and just will convert the {@link Long} to the {@link BigDecimal}
 * using the {@link BigDecimal#valueOf(long)}
 * if the source not null, another will return the null value
 *
 * @author Edward Lukashevits
 * @since 0.0.1
 */
public class LongToBigDecimal implements Converter<Long, BigDecimal> {
    @Override
    public BigDecimal convert(MappingContext<Long, BigDecimal> context) {
        return Optional.of(context)
                .map(MappingContext::getSource)
                .map(BigDecimal::valueOf)
                .orElse(null);
    }
}
