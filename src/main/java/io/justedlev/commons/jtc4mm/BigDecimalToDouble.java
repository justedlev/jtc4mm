package io.justedlev.commons.jtc4mm;

import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;

import java.math.BigDecimal;
import java.util.Optional;

/**
 * The class is implementation of the {@link Converter}&lt;{@link BigDecimal}, {@link Double}&gt;
 * and just will convert the {@link BigDecimal} to the {@link Double}
 * using the {@link BigDecimal#doubleValue()}
 * if the source not null, another will return the null value
 *
 * @author Edward Lukashevits
 * @since 0.0.1
 */
public class BigDecimalToDouble implements Converter<BigDecimal, Double> {

    /**
     * @param context of current mapping process
     * @return {@link Double}
     */
    @Override
    public Double convert(MappingContext<BigDecimal, Double> context) {
        return Optional.of(context)
                .map(MappingContext::getSource)
                .map(BigDecimal::doubleValue)
                .orElse(null);
    }

}
