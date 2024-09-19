package io.justedlev.commons.jtc4mm;

import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;

import java.math.BigDecimal;
import java.util.Optional;

/**
 * The class is implementation of the {@link Converter}&lt;{@link BigDecimal}, {@link Float}&gt;
 * and just will convert the {@link BigDecimal} to the {@link Float}
 * using the {@link BigDecimal#floatValue()}
 * if the source not null, another will return the null value
 *
 * @author Edward Lukashevits
 * @since 0.0.1
 */
public class BigDecimalToFloat implements Converter<BigDecimal, Float> {

    /**
     * @param context of current mapping process
     * @return {@link Float}
     */
    @Override
    public Float convert(MappingContext<BigDecimal, Float> context) {
        return Optional.of(context)
                .map(MappingContext::getSource)
                .map(BigDecimal::floatValue)
                .orElse(null);
    }

}
