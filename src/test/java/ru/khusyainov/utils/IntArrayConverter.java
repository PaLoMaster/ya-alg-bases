package ru.khusyainov.utils;

import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.SimpleArgumentConverter;

import java.util.Arrays;

public class IntArrayConverter extends SimpleArgumentConverter {
    @Override
    protected Object convert(Object source, Class<?> targetType) throws ArgumentConversionException {
        if (!(source instanceof String)) {
            throw new IllegalArgumentException("The argument should be a string: " + source);
        }
        try {
            if (((String) source).contains("\n")) {
                return Arrays.stream(((String) source).split("\n"))
                        .map(s -> Arrays.stream(s.split(" ")).map(Integer::parseInt).toArray(Integer[]::new))
                        .toArray(Integer[][]::new);
            }
            return Arrays.stream(((String) source).split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        } catch (Exception e) {
            throw new IllegalArgumentException("Failed to convert", e);
        }
    }
}
