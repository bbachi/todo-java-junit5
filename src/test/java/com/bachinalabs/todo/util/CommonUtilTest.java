package com.bachinalabs.todo.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommonUtilTest {

    @Test
    void checkStringIfIsBlank() {

        String str = "";

        assertTrue(CommonUtil.isBlank(str), "true");
    }

    @Test
    void checkStringIfIsNotBlank() {

        String str = "not blank";

        assertTrue(CommonUtil.isNotBlank(str), "true");
    }
}
