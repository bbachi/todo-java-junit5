package com.bachinalabs.todo.util;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommonUtilRepeatedTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(CommonUtilLifeCycleTest.class);

    @BeforeEach
    void init(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        int currentRepetition = repetitionInfo.getCurrentRepetition();
        int totalRepetitions = repetitionInfo.getTotalRepetitions();
        String methodName = testInfo.getTestMethod().get().getName();
        LOGGER.info(String.format("About to execute repetition %d of %d for %s", //
                currentRepetition, totalRepetitions, methodName));
    }

    @RepeatedTest(10)
    @DisplayName("checkStringIfIsBlank Test Repeating 10 times")
    void checkStringIfIsBlank() {

        String str = "";

        assertTrue(CommonUtil.isBlank(str), "true");
    }

    @RepeatedTest(value = 5, name = "{displayName} {currentRepetition}/{totalRepetitions}")
    @DisplayName("checkStringIfIsBlank Test Repeating 5 times")
    void checkStringIfIsNotBlank() {

        String str = "not blank";

        assertTrue(CommonUtil.isNotBlank(str), "true");
    }
}
