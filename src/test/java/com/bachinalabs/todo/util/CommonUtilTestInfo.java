package com.bachinalabs.todo.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommonUtilTestInfo {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommonUtilTestInfo.class);

    @BeforeEach
    void init(TestInfo testInfo) {
        LOGGER.info("Display Name::::::" + testInfo.getDisplayName());
    }

    @Test
    @DisplayName("When the string is given, it should be empty")
    void checkStringIfIsBlank(TestInfo testInfo) {

        LOGGER.info("Display Name::::::" + testInfo.getDisplayName());
        LOGGER.info("Test Method:::::::" + testInfo.getTestMethod());
        String str = "";

        assertTrue(CommonUtil.isBlank(str), "true");
    }

    @Test
    @DisplayName("When the string is given, it should not be empty")
    void checkStringIfIsNotBlank(TestInfo testInfo) {

        LOGGER.info("Display Name::::::" + testInfo.getDisplayName());
        LOGGER.info("Test Method:::::::" + testInfo.getTestMethod());
        String str = "not blank";

        assertTrue(CommonUtil.isNotBlank(str), "true");
    }
}
