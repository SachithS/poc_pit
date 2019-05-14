package com.poc.pit.test.message;

import com.poc.pit.message.MessageBuilder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMessageBuilder {

    @Test
    public void testNameJohn() {

        MessageBuilder obj = new MessageBuilder();
        assertEquals("Hello John", obj.getMessage("John"));

    }

    @Test
    public void testNameEmpty() {

        MessageBuilder obj = new MessageBuilder();
        assertEquals("Please provide a name!", obj.getMessage(" "));

    }
}
