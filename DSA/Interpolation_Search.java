/*

Interpolation Search : Is an improved version of binary search.
                       Estimating the position of the target based on its value in a sorted array


Interpolation Search works best when:
- The data is sorted.
- The values are uniformly distributed (i.e., no huge jumps between values).
- If the data is non-uniformly distributed, binary search may be a better choice.


Binary Search:  Divides the search space in half by comparing the middle element.
Interpolation Search: Estimates the position based on the value of the target relative to the current range,
which may result in fewer comparisons if the data is uniformly distributed.



*/


package DSA;

public class Interpolation_Search {
    public static void main(String[] args){


        int[] array = {1,2,3,4,5,6,7,8,9};   // Initializing an array of sorted integers.

        // Calling the interpolationSearch method to find the value 5.
        int index = interpolationSearch(array, 5);

        // If the element is found, print the index.
        if (index != -1){
            System.out.println("Element Found At Index : " + index);
        }

        // If the element is not found, print "Not Found".
        else {
            System.out.println("Element Not Found :(");
        }
    }

    // Method for performing interpolation search
    private static int interpolationSearch(int[] array, int value) {


        int low = 0;    // Initializing low and high pointers
        int high = array.length - 1;

        // Run the loop until the target value is within the current range.
        while(value >= array[low] && value <= array[high] && low <= high) {

            // Calculate the probe position based on the formula.
            int probe = low + (high - low) * (value - array[low]) /
                    (array[high] - array[low]);

            // Print the current probe position for debugging
            System.out.println("Probe : " + probe);

            // If the element at the probe position is the target, return its index.
            if (array[probe] == value){
                return probe;
            }
            else{
                // If the element at the probe is greater than the target, search the left part.
                high = probe - 1;
            }
        }

        // Return -1 if the element is not found in the array.
        return -1;
    }
}
