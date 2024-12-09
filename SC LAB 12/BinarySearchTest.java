package lab7;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class BinarySearchTest {

    @Test
    public void testIntegerBinarySearchRecursiveSingleIndex() {
        Integer[] intArray = {1, 3, 5, 7, 9};
        int target = 5;
        int result = BinarySearch.binarySearchRecursive(intArray, target, 0, intArray.length - 1);
        assertEquals(2, result); // Expected index of 5 is 2
    }

    @Test
    public void testIntegerBinarySearchRecursiveTargetNotFound() {
        Integer[] intArray = {1, 3, 5, 7, 9};
        int target = 8;
        int result = BinarySearch.binarySearchRecursive(intArray, target, 0, intArray.length - 1);
        assertEquals(-1, result); // Target 8 is not in the array
    }

    @Test
    public void testIntegerBinarySearchAllIndices() {
        Integer[] intArray = {1, 3, 5, 5, 7, 9};
        int target = 5;
        List<Integer> indices = BinarySearch.binarySearchAllIndices(intArray, target, 0, intArray.length - 1, new ArrayList<>());
        assertEquals(List.of(2, 3), indices); // Expected indices of 5 are [2, 3]
    }

    @Test
    public void testStringBinarySearchRecursiveSingleIndex() {
        String[] strArray = {"apple", "banana", "cherry", "date", "elderberry"};
        String target = "cherry";
        int result = BinarySearch.binarySearchRecursive(strArray, target, 0, strArray.length - 1);
        assertEquals(2, result); // Expected index of "cherry" is 2
    }

    @Test
    public void testStringBinarySearchRecursiveTargetNotFound() {
        String[] strArray = {"apple", "banana", "cherry", "date", "elderberry"};
        String target = "fig";
        int result = BinarySearch.binarySearchRecursive(strArray, target, 0, strArray.length - 1);
        assertEquals(-1, result); // Target "fig" is not in the array
    }

    @Test
    public void testStringBinarySearchAllIndices() {
        String[] strArray = {"apple", "banana", "banana", "cherry", "date"};
        String target = "banana";
        List<Integer> indices = BinarySearch.binarySearchAllIndices(strArray, target, 0, strArray.length - 1, new ArrayList<>());
        
        // Check that the size of the result is as expected
        assertEquals(2, indices.size());
        
        // Check individual elements
        assertTrue(indices.contains(1));
        assertTrue(indices.contains(2));
    }


    @Test
    public void testEmptyArray() {
        Integer[] emptyArray = {};
        int target = 5;
        int result = BinarySearch.binarySearchRecursive(emptyArray, target, 0, emptyArray.length - 1);
        assertEquals(-1, result); // Empty array should return -1
    }

    @Test
    public void testNullArray() {
        Integer[] nullArray = null;
        int target = 5;
        int result = BinarySearch.binarySearchRecursive(nullArray, target, 0, 0);
        assertEquals(-1, result); // Null array should return -1
    }
}
