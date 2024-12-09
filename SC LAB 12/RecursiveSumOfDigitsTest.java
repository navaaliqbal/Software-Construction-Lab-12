package lab7;

import org.junit.Test;
import static org.junit.Assert.*;

public class RecursiveSumOfDigitsTest {

    // Test case for a positive integer
    @Test
    public void testPositiveInteger() {
        int number = 12345;
        int result = RecursiveSumOfDigits.sumOfDigits(number);
        assertEquals(15, result);  // 1 + 2 + 3 + 4 + 5 = 15
    }

    // Test case for a negative integer
    @Test
    public void testNegativeInteger() {
        int number = -12345;
        int result = RecursiveSumOfDigits.sumOfDigits(number);
        assertEquals(15, result);  // 1 + 2 + 3 + 4 + 5 = 15 (absolute value is taken)
    }

    // Test case for zero
    @Test
    public void testZero() {
        int number = 0;
        int result = RecursiveSumOfDigits.sumOfDigits(number);
        assertEquals(0, result);  // sum of digits of 0 is 0
    }

    // Test case for a large number
    @Test
    public void testLargeNumber() {
        int number = 987654321;
        int result = RecursiveSumOfDigits.sumOfDigits(number);
        assertEquals(45, result);  // 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0 = 45
    }

    // Test case for a negative large number
    @Test
    public void testNegativeLargeNumber() {
        int number = -987654321;
        int result = RecursiveSumOfDigits.sumOfDigits(number);
        assertEquals(45, result);  // 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0 = 45 (absolute value is taken)
    }

    // Test case for a single digit number
    @Test
    public void testSingleDigit() {
        int number = 7;
        int result = RecursiveSumOfDigits.sumOfDigits(number);
        assertEquals(7, result);  // sum of digits of 7 is 7
    }

    // Test case for a negative single digit number
    @Test
    public void testNegativeSingleDigit() {
        int number = -7;
        int result = RecursiveSumOfDigits.sumOfDigits(number);
        assertEquals(7, result);  // sum of digits of -7 is 7 (absolute value is taken)
    }
}
