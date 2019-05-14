package com.poc.pit.test.palindrome;

import com.poc.pit.palindrome.Palindrome;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PalindromeTest {

    @Test
    public void whenPalindrome_thenAccept() {
        Palindrome palindromeTester = new Palindrome();
        assertTrue(palindromeTester.isPalindrome("noon"));
    }
}
