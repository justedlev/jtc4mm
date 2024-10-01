package io.justedlev.commons.jtc4mm;

import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Optional;

/**
 * A converter class that implements {@link Converter} interface to convert a {@link java.sql.Date}
 * to a {@link LocalDate}.
 * It uses a {@link MappingContext} to retrieve the source {@link java.sql.Date} and attempts to convert it to a {@link LocalDate}.
 * If the source is null, the conversion will return null.
 *
 * <p>Example usage:</p>
 * <pre>
 *     var converter = new LocalDateToSqlDate();
 *     var mm = new ModelMapper();
 *     mm.addConverter(converter);
 *     var res = mm.map(new Date(System.currentTimeMillis()), LocalDate.class);
 * </pre>
 *
 * @author Justedlev
 * @see org.modelmapper.ModelMapper
 * @see Converter
 */
public class SqlDateToLocalDate implements Converter<java.sql.Date, LocalDate> {
    /**
     * Converts a {@link java.sql.Date} to a {@link LocalDate} using the provided {@link MappingContext}.
     * The method extracts the source {@link java.sql.Date} from the context and converts it
     * to a {@link LocalDate}. If the source is null, it returns null.
     *
     * @param context the mapping context containing the source {@link java.sql.Date}
     * @return the converted {@link LocalDate}, or null if the source is null
     */
    @Override
    public LocalDate convert(MappingContext<Date, LocalDate> context) {
        return Optional.of(context)
                .map(MappingContext::getSource)
                .map(Date::toLocalDate)
                .orElse(null);
    }
}
