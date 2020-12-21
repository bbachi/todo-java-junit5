package com.bachinalabs.todo.util;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidateUtilTest {

    @Nested
    @DisplayName("Name Validations")
    class NameValidations {

        @Test
        @DisplayName("Task Name Should Not Be Empty")
        void NameShouldNotBeEmpty() {

            String name = "";

            assertEquals(false, ValidateUtil.validateName(name));
        }

        @Test
        @DisplayName("Task Name Should be less than 100")
        void NameShouldBeLessThan100() {

            String name = "werwerwerwerwrew";

            assertEquals(true, ValidateUtil.validateName(name));
        }

        @Test
        @DisplayName("Task Name Should not be greater than 100")
        void NameShouldNotBeGreaterThan100() {

            String name = "werwerwerwerwreerewrwerewrwerwerwerwerwerwerwewerwerwerwrwerwerwerwerwerrwerwerwerwerwerwerewrwerewrewrewrewrwerewrw";

            assertEquals(false, ValidateUtil.validateName(name));
        }
    }


    @Nested
    @DisplayName("Description Validations")
    class DescriptionValidations {

        @Test
        @DisplayName("Task Description Should Not Be Empty")
        void DescriptionShouldNotBeEmpty() {

            String description = "";

            assertEquals(false, ValidateUtil.validateDescription(description));
        }

        @Test
        @DisplayName("Task Description Should be less than 200")
        void DescriptionShouldBeLessThan100() {

            String description = "werwerwerwerwrew";

            assertEquals(true, ValidateUtil.validateDescription(description));
        }

        @Test
        @DisplayName("Task Description Should not be greater than 200")
        void DescriptionShouldNotBeGreaterThan100() {

            String description = "werwerwerwerwreerewrwerewrwerwerwerwerwerwerwewerwerwerwrwerwerwerwerwerrwerwerwerwerwerwerewrwerewrewrewrewrwerewrw" +
                    "werwerwerwerwreerewrwerewrwerwerwerwerwerwerwewerwerwerwrwerwerwerwerwerrwerwerwerwerwerwerewrwerewrewrewrewrwerewrw";

            assertEquals(false, ValidateUtil.validateDescription(description));
        }
    }


    @Nested
    @DisplayName("Email Validations")
    class EmailValidations {

        @Test
        @DisplayName("Task Email Should Not Be Empty")
        void EmailShouldNotBeEmpty() {

            String email = "";

            assertEquals(false, ValidateUtil.validateEmail(email));
        }

        @Test
        @DisplayName("Task Email Should be in valid format")
        void EmailShouldBeInValidFormat() {

            String email = "abc@gmamil.com";

            assertEquals(true, ValidateUtil.validateEmail(email));
        }
    }
}
