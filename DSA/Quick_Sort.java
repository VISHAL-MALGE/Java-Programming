/*

 Quick Sort : It works by selecting a "pivot" element, divide array into 2 parts based on the pivot,
              and then sorting those parts recursively.

              - Quick Sort is a divide-and-conquer algorithm used to sort elements.


------------- How Quick Sort Works -------------------

              1. Choose a Pivot:
               - Select any element in the array as the pivot
               - (commonly the last element, first element, or a random one).

              2. Partitioning:
               - Rearrange the array so:

               - All elements < pivot are on the left.
               - All elements > pivot are on the right. The pivot is now in its correct position.

              3. Recursively Apply:
               - Apply the same steps to the left and right parts until the array is sorted.

               4. Run-time complexity
                - Best case O(n log(n))
                - Average case O(n log(n))
                - Worst case O(nA2) if already sorted


*/




package DSA;

public class Quick_Sort {
    public static void main(String[] args){


        int[] array = {2, 6, 4, 8, 3, 9, 5, 7, 1};

        quickSort(array, 0, array.length - 1);

        for (int i : array){
            System.out.print(i + " ");
        }

    }

    private static void quickSort(int[] array, int start, int end) {

        if( end <= start) return;   // base case

        int pivot = divide(array, start , end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);

    }


    private static int divide(int[] array, int start, int end) {

        int pivot = array[end];
        int i = start - 1;

        for (int j = start;  j <= end; j++){
            if (array[j] < pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }


}
