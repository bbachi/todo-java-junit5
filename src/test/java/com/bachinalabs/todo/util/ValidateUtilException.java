package com.bachinalabs.todo.util;

import com.bachinalabs.todo.exception.ValidationException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ValidateUtilException {

    @Test
    @DisplayName("Should Throw Exception when the name is empty")
    void shouldThrowExceptionWhenEmpty() {

        String name = "";

        try {
            boolean result = ValidateUtil.validateNameAndThrowException(name);
        } catch (ValidationException ex) {
            assertEquals("Name Shoule Not be Empty", ex.getMessage());
        }
    }

    @Test
    @DisplayName("Name should be less than 100")
    void shouldThrowExceptionWhenNameLengthGreaterThan100() {

        String name = "qeqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqe" +
                "qweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqweqw";
        ValidationException result = assertThrows(ValidationException.class, () -> ValidateUtil.validateNameAndThrowException(name));
        assertEquals("The Length of the Name Shoule Not greater than 100", result.getMessage());
    }
}
