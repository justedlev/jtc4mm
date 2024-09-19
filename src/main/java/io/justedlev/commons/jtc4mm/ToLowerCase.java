package io.justedlev.commons.jtc4mm;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;

import java.util.Locale;
import java.util.Optional;

/**
 * The class is implementation of the {@link Converter}&lt;{@link String}, {@link String}&gt;
 * and just will convert the {@link String} to lower case
 * using the {@link String#toLowerCase()} by default
 * the {@link Locale} can be customized if needed,
 * another case will return the null value
 *
 * @author Edward Lukashevits
 * @since 0.0.1
 */
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class ToLowerCase implements Converter<String, String> {
    private Locale locale = Locale.getDefault();

    @Override
    public String convert(MappingContext<String, String> context) {
        return Optional.of(context)
                .map(MappingContext::getSource)
                .map(value -> value.toLowerCase(locale))
                .orElse(null);
    }
}
