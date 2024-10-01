package io.justedlev.commons.jtc4mm;

import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;

import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

/**
 * A converter class that implements {@link Converter} interface to convert a {@link String} to a {@link UUID}.
 * It uses a {@link MappingContext} to retrieve the source {@link String} and attempts to convert it to a {@link UUID}.
 * If the source is null or invalid, the conversion will return null.
 *
 * <p>Example usage:</p>
 * <pre>
 *     StringToUUID converter = new StringToUUID();
 *     UUID uuid = converter.convert(mappingContext);
 * </pre>
 *
 * @author Justedlev
 */
public class StringToUUID implements Converter<String, UUID> {
    /**
     * Converts a {@link String} to a {@link UUID} using the provided {@link MappingContext}.
     * The method extracts the source string from the context and attempts to convert it
     * to a {@link UUID}. If the string is null or invalid, it returns null.
     *
     * @param context the mapping context containing the source string
     * @return the converted {@link UUID}, or null if the source is null or invalid
     * @throws IllegalArgumentException see {@link UUID#fromString(String)}
     * @see Converter
     */
    @Override
    public UUID convert(MappingContext<String, UUID> context) {
        return Optional.of(context)
                .map(MappingContext::getSource)
                .filter(Predicate.not(String::isBlank))
                .map(UUID::fromString)
                .orElse(null);
    }
}
