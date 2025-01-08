/*

    Binary Search : Binary search is a fast search algorithm used on sorted lists.
                    repeatedly dividing the search range in half until the target is found or
                    the list is fully checked.

                    Run Time Complexity: O(log n),  time increases very slowly as the list grows.

                    Disadvantages : need to be sorted array

                    - Start with the entire list.
                    - Find the middle element.
                    - If the middle element is the target, you’re done! 🎉
                    - If the middle element is smaller than the target, search the right half (ignore the left half).
                    - If the middle element is larger than the target, search the left half (ignore the right half).
                    - Repeat the process until you find the target or run out of elements to search.


                    Key Points:
                    - Binary search only works on sorted lists.
                    - It's much faster than linear search because it keeps cutting the list in half.


*/


package DSA;

import java.util.Arrays;

public class Binary_Search {
    public static void main(String[] args) {


        int array[] = new int[100000];  // Creating array of 100000 elements.

        // Defining the target value we want to find in the array.
        int target = 4500;

        // Populating the array with values from 0 to 99999 (increasing order).
        for (int i = 0; i < array.length; i++) {
            array[i] = i;  // Array is filled with values like 0, 1, 2, ..., 99999.
        }

        // Calling the binarySearch method to find the target in the array.
        int index = binarySearch(array, target);

        // If the target is found, the index will be returned, else -1.
        if (index == -1) {

            // If the index is -1, target was not found.
            System.out.print(target + " Not Found :(");
        }

        else {

            // If target is found, print the index where it was found.
            System.out.println("Target Found At Index : " + index);
        }
    }

    // Method to perform binary search on the given array.
    private static int binarySearch(int[] array, int target) {

        // Initializing the low and high pointers for the search range.
        int low = 0;
        int high = array.length - 1;  // High starts at the last index.

        // Loop continues until low is less than or equal to high.
        while (low <= high) {


            int middle = low + (high - low) / 2;   // Finding the middle index of the current range.

            int value = array[middle];   // Getting the value at the middle index.

            System.out.println("Middle : " + value);  // Printing the middle value for debugging purposes.


            // If the middle value is less than the target, search the right half.
            if (value < target) {
                low = middle + 1;  // Move the low pointer to middle + 1 (ignore the left half).
            }
            // If the middle value is greater than the target, search the left half.
            else if (value > target) {
                high = middle - 1;  // Move the high pointer to middle - 1 (ignore the right half).
            }
            // If middle value equals the target, return the middle index.
            else {
                return middle;  // Target found, return the index.
            }
        }

        // If the target is not found, return -1.
        return -1;
    }
}

