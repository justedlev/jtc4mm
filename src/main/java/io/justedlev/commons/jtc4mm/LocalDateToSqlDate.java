package io.justedlev.commons.jtc4mm;

import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Optional;

/**
 * A converter class that implements {@link Converter} interface to convert a {@link LocalDate}
 * to a {@link Date} (java.sql.Date).
 * It uses a {@link MappingContext} to retrieve the source {@link LocalDate} and attempts to convert it to a {@link Date}.
 * If the source is null, the conversion will return null.
 *
 * <p>Example usage:</p>
 * <pre>
 *     var converter = new LocalDateToSqlDate();
 *     var mm = new ModelMapper();
 *     mm.addConverter(converter);
 *     var sqlDate = mm.map(LocalDate.now(), Date.class);
 * </pre>
 *
 * @author Justedlev
 * @see org.modelmapper.ModelMapper#addConverter(Converter)
 */
public class LocalDateToSqlDate implements Converter<LocalDate, Date> {
    /**
     * Converts a {@link LocalDate} to a {@link Date} using the provided {@link MappingContext}.
     * The method extracts the source {@link LocalDate} from the context and converts it
     * to a {@link Date} (java.sql.Date). If the source is null, it returns null.
     *
     * @param context the mapping context containing the source {@link LocalDate}
     * @return the converted {@link Date}, or null if the source is null
     */
    @Override
    public Date convert(MappingContext<LocalDate, Date> context) {
        return Optional.of(context)
                .map(MappingContext::getSource)
                .map(Date::valueOf)
                .orElse(null);
    }
}
