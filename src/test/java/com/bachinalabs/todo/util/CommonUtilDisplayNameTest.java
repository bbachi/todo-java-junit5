package com.bachinalabs.todo.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommonUtilDisplayNameTest {

    @DisplayName("When the string is given, it should be empty")
    @Test
    void checkStringIfIsBlank() {

        String str = "";

        assertTrue(CommonUtil.isBlank(str), "true");
    }

    @DisplayName("When the string is given, it should not be empty")
    @Test
    void checkStringIfIsNotBlank() {

        String str = "not blank";

        assertTrue(CommonUtil.isNotBlank(str), "true");
    }
}
