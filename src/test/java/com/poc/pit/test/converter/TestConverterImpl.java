    package com.poc.pit.test.converter;

import com.poc.pit.converter.Converter;
import com.poc.pit.converter.ConverterImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(value = Parameterized.class)
public class TestConverterImpl {

    private Converter notationConverter = new ConverterImpl();
    private String camelToConstantInput;
    private String camelToConstantOutput;
    private String constantToCamelInput;
    private String constantToCamelOutput;

    public TestConverterImpl(String input, String output) {
        camelToConstantInput = input;
        camelToConstantOutput = output;
        constantToCamelInput = output;
        constantToCamelOutput = input;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][]{{"short", "SHORT"}, {"mediumString", "MEDIUM_STRING"}, {"veryLongString", "VERY_LONG_STRING"},
                {"short1", "SHORT1"}, {"1short", "1SHORT"}, {"short1string", "SHORT1STRING"}, {"longOBigString", "LONG_O_BIG_STRING"}};
        return Arrays.asList(data);
    }

    @Test
    public void shouldChangeNameToUnderscoreUpperCase() {
        // when
        String result = notationConverter.convertToUnderscoreUpperCase(camelToConstantInput);

        // then
        assertThat(result, is(camelToConstantOutput));
    }

    @Test
    public void shouldChangeNameToCamelCase() {
        // when
        String result = notationConverter.convertToCamelCase(constantToCamelInput);

        // then
        assertThat(result, is(constantToCamelOutput));
    }
}
