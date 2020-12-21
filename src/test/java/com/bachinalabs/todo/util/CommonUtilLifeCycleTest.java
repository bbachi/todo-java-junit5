package com.bachinalabs.todo.util;

import com.bachinalabs.todo.controller.ToDoController;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommonUtilLifeCycleTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommonUtilLifeCycleTest.class);

    @BeforeAll
    static void setupBeforeAllTests() {
        LOGGER.info("Setup Before all the tests");
    }

    @BeforeEach
    void setupBeforeEachTest() {
        LOGGER.info("Setup Before each test");
    }

    @Test
    void checkStringIfIsBlank() {

        String str = "";
        LOGGER.info("Test --- checkStringIfIsBlank()");
        assertTrue(CommonUtil.isBlank(str), "true");
    }

    @Test
    void checkStringIfIsNotBlank() {

        String str = "not blank";
        LOGGER.info("Test --- checkStringIfIsNotBlank()");
        assertTrue(CommonUtil.isNotBlank(str), "true");
    }

    @AfterEach
    void setupAfterEachTest() {
        LOGGER.info("Setup After each test");
    }

    @AfterAll
    static void setupAfterAllTests() {
        LOGGER.info("Setup After all the tests");
    }
}
