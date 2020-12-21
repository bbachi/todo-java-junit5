package com.bachinalabs.todo.util;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ValidateUtilOrderTest {

    @Test
    @DisplayName("Task Name Should not be greater than 100")
    @Order(3)
    void NameShouldNotBeGreaterThan100() {

        String name = "werwerwerwerwreerewrwerewrwerwerwerwerwerwerwewerwerwerwrwerwerwerwerwerrwerwerwerwerwerwerewrwerewrewrewrewrwerewrw";

        assertEquals(false, ValidateUtil.validateName(name));
    }

    @Test
    @Order(2)
    @DisplayName("Task Description Should be less than 200")
    void DescriptionShouldBeLessThan100() {

        String description = "werwerwerwerwrew";

        assertEquals(true, ValidateUtil.validateDescription(description));
    }

    @Test
    @DisplayName("Task Email Should be in valid format")
    @Order(1)
    void EmailShouldBeInValidFormat() {

        String email = "abc@gmamil.com";

        assertEquals(true, ValidateUtil.validateEmail(email));
    }
}
