package lab7;

import org.junit.Test;
import static org.junit.Assert.*;

public class RecursiveParserTest {

    // Test case for simple addition
    @Test
    public void testSimpleAddition() {
        String expression = "3 + 5";
        double result = RecursiveParser.evaluateExpression(expression);
        assertEquals(8.0, result, 0.0001); // Allow a small margin for floating point precision
    }

    // Test case for simple subtraction
    @Test
    public void testSimpleSubtraction() {
        String expression = "10 - 4";
        double result = RecursiveParser.evaluateExpression(expression);
        assertEquals(6.0, result, 0.0001);
    }

    // Test case for multiplication
    @Test
    public void testMultiplication() {
        String expression = "2 * 3";
        double result = RecursiveParser.evaluateExpression(expression);
        assertEquals(6.0, result, 0.0001);
    }

    // Test case for division
    @Test
    public void testDivision() {
        String expression = "10 / 2";
        double result = RecursiveParser.evaluateExpression(expression);
        assertEquals(5.0, result, 0.0001);
    }

    // Test case for division by zero
    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        String expression = "10 / 0";
        RecursiveParser.evaluateExpression(expression);  // This should throw ArithmeticException
    }

    // Test case for handling parentheses
    @Test
    public void testParentheses() {
        String expression = "(3 + 5) * 2";
        double result = RecursiveParser.evaluateExpression(expression);
        assertEquals(16.0, result, 0.0001);
    }

    // Test case for nested parentheses
    @Test
    public void testNestedParentheses() {
        String expression = "3 * (2 + (4 - 1))";
        double result = RecursiveParser.evaluateExpression(expression);
        assertEquals(15.0, result, 0.0001);
    }

    // Test case for handling floating point numbers
    @Test
    public void testFloatingPoint() {
        String expression = "3.5 + 2.5";
        double result = RecursiveParser.evaluateExpression(expression);
        assertEquals(6.0, result, 0.0001);
    }



    // Test case for negative numbers
    @Test
    public void testNegativeNumber() {
        String expression = "-3 + 5";
        double result = RecursiveParser.evaluateExpression(expression);
        assertEquals(2.0, result, 0.0001);
    }

  

    // Test case for invalid expression
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidExpression() {
        String expression = "3 + * 5";
        RecursiveParser.evaluateExpression(expression);  // This should throw IllegalArgumentException
    }

    // Test case for empty expression
    @Test(expected = IllegalArgumentException.class)
    public void testEmptyExpression() {
        String expression = "";
        RecursiveParser.evaluateExpression(expression);  // This should throw IllegalArgumentException
    }
}
