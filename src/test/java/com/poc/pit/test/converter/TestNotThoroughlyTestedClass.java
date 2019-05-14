package com.poc.pit.test.converter;

import com.poc.pit.converter.NotThoroughlyTestedClass;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TestNotThoroughlyTestedClass {

    private NotThoroughlyTestedClass testedClass = new NotThoroughlyTestedClass();

    private int number;

    @Test
    public void shouldReturnTrueWhenNumberHigherThanZero() {
        // given
        number = 1;

        // when
        boolean result = testedClass.isHigherOrEqualToZero(number);

        // then
        assertThat(result, is(true));
    }


    @Test
    public void shouldReturnFalseWhenNumberLowerThanZero() {
        // given
        number = -1;

        // when
        boolean result = testedClass.isHigherOrEqualToZero(number);

        // then
        assertThat(result, is(false));
    }
}
