package lab7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {

    // Generic recursive binary search to find a single index
    public static <T extends Comparable<T>> int binarySearchRecursive(T[] array, T target, int left, int right) {
        if (array == null || array.length == 0) {
            return -1; // Array is null or empty
        }
        if (left > right) {
            return -1; // Base case: search range is empty
        }

        int mid = left + (right - left) / 2;
        int comparison = target.compareTo(array[mid]);

        if (comparison == 0) {
            return mid; // Target found
        } else if (comparison < 0) {
            return binarySearchRecursive(array, target, left, mid - 1); // Search left half
        } else {
            return binarySearchRecursive(array, target, mid + 1, right); // Search right half
        }
    }

    // Generic recursive binary search to find all indices of the target value
    public static <T extends Comparable<T>> List<Integer> binarySearchAllIndices(T[] array, T target, int left, int right, List<Integer> indices) {
        if (array == null || array.length == 0) {
            return indices; // Array is null or empty
        }
        if (left > right) {
            return indices; // Base case: search range is empty
        }

        int mid = left + (right - left) / 2;
        int comparison = target.compareTo(array[mid]);

        if (comparison == 0) {
            indices.add(mid); // Add the index of the current target match

            // Search for additional occurrences on both sides
            binarySearchAllIndices(array, target, left, mid - 1, indices);
            binarySearchAllIndices(array, target, mid + 1, right, indices);
        } else if (comparison < 0) {
            binarySearchAllIndices(array, target, left, mid - 1, indices); // Search left half
        } else {
            binarySearchAllIndices(array, target, mid + 1, right, indices); // Search right half
        }

        return indices;
    }

    public static void main(String[] args) {
        // Integer array example
        Integer[] intArray = {1, 3, 5, 5, 7, 9};
        int intTarget = 6;
        int intResult = binarySearchRecursive(intArray, intTarget, 0, intArray.length - 1);
        List<Integer> intIndices = binarySearchAllIndices(intArray, intTarget, 0, intArray.length - 1, new ArrayList<>());
        System.out.println("Integer: First occurence found at : " + intResult); // Expected: 2
        System.out.println("Integer: All occurences at: " + intIndices); // Expected: [2, 3]

        // String array example
        String[] strArray = {"apple", "ball", "camera", "dog", "egg"};
    
        String strTarget = "camera";
        int strResult = binarySearchRecursive(strArray, strTarget, 0, strArray.length - 1);
        List<Integer> strIndices = binarySearchAllIndices(strArray, strTarget, 0, strArray.length - 1, new ArrayList<>());
        System.out.println("Strings: First Occcurence found at : " + strResult); // Expected: 1
        System.out.println("Strings: All Occurences at  : " + strIndices); // Expected: [1, 2]
    }
}