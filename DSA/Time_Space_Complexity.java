package DSA;


import java.util.*;

public class Time_Space_Complexity {
    public static void main(String[] args){

/*  --------  1. Constant Time - O(1)  -----------------
        Meaning: The time taken doesn’t change, no matter how much input you have.

        Ex: Checking if the first item in a list is even.
            random access of an element in an array
            inserting at the beginning of the linked list

        Why: You only check one specific item, so it’s always fast.

 */
        int[] numbers = {3, 5, 8, 10};
        System.out.println(numbers[0]);  // Always takes the same time.






/*  ---------    2. Linear Time - O(n)  -----------------
        Meaning: Time increases directly with the size of the input.

        Example: Checking if a number exists in a list.
                 looping through elements in an array
                 searching through linked list

        Why: If the list has 100 items, you might need to check all 100.

 */

//        int[] numbers = {3, 5, 8, 10};
        for (int num : numbers) {
            if (num == 8) {
                System.out.println("Found!");
            }
        }





/*  ----------  3. Logarithmic Time - O(log n)  ------------------
        Meaning: Time increases slowly even if input grows large.

        Example : Searching in a sorted list using Binary Search.

        Why: You cut the list size in half each time, making it very efficient.

 */
//        int binarySearch;(int[] arr, int target) {
//            int left = 0, right = arr.length - 1;
//            while (left <= right) {
//                int mid = left + (right - left) / 2;
//                if (arr[mid] == target) {
//                    return mid;
//                } else if (arr[mid] < target) {
//                    left = mid + 1;
//                } else {
//                    right = mid - 1;
//                }
//            }
//            return -1;
//        }




/*  ----------  4. Quadratic Time - O(n²)  -------------------
        Meaning: Time grows rapidly as the input size increases.

        Example: Checking all pairs of items in a list (like comparing students in a class).
                 insertion sort
                 selection sort
                 bubble sort

        Why: If there are 100 items, you need to check 100 × 100 = 10,000 pairs.

 */

//        int[] numbers = {3, 5, 8, 10};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.println(numbers[i] + ", " + numbers[j]);
            }
        }






    }
}
