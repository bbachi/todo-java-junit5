package com.bachinalabs.todo.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidateUtiiParameterizedTest {

    @Nested
    @DisplayName("Email Validations")
    class EmailValidations {

        @Test
        @DisplayName("Task Email Should Not Be Empty")
        void EmailShouldNotBeEmpty() {

            String email = "";

            assertEquals(false, ValidateUtil.validateEmail(email));
        }

        @ParameterizedTest(name = "{0} Should be valid email")
        @ValueSource(strings = {"abc@gmail.com", "asdasds@yahoo.com", "test@admin.com"})
        @DisplayName("Task Email Should be in valid format")
        void EmailShouldBeInValidFormat(String email) {

            assertEquals(true, ValidateUtil.validateEmail(email));

        }
    }
}
