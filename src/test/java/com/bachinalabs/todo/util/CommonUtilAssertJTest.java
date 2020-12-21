package com.bachinalabs.todo.util;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CommonUtilAssertJTest {

    @DisplayName("When the string is given, it should be empty")
    @Test
    void checkStringIfIsBlank() {

        String str = "";

        assertThat(CommonUtil.isBlank(str)).isEqualTo(true);
    }

    @DisplayName("When the string is given, it should not be empty")
    @Test
    void checkStringIfIsNotBlank() {

        String str = "not blank";

        assertThat(CommonUtil.isNotBlank(str)).isEqualTo(true);
    }
}
