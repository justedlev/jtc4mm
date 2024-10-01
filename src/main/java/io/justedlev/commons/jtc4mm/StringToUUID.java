package io.justedlev.commons.jtc4mm;

import org.modelmapper.Converter;
import org.modelmapper.spi.MappingContext;

import java.util.Optional;
import java.util.UUID;
import java.util.function.Predicate;

public class StringToUUID implements Converter<String, UUID> {
    @Override
    public UUID convert(MappingContext<String, UUID> context) {
        return Optional.of(context)
                .map(MappingContext::getSource)
                .filter(Predicate.not(String::isBlank))
                .map(UUID::fromString)
                .orElse(null);
    }
}
