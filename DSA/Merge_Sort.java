/*

    Merge Sort : a divide-and-conquer sorting algorithm.
    It splits the array into smaller parts, sorts them, and
    then merges them back into a single sorted array.

    1. Divide:
        - Split the array into two halves repeatedly until each part contains only one element
        (a single element is always sorted)

    2. Conquer:
        - Sort and merge the smaller arrays step by step until the entire array is merged and sorted.


*/




package DSA;

public class Merge_Sort {

    public static void main(String[] args){

        int[] array = {7, 5, 3, 8, 2, 9, 1};

        mergeSort(array);

        for (int j : array) {          // Enhanced loop
            System.out.print(j + " ");
        }

    }

    private static void mergeSort(int[] array) {

        int length = array.length;

        if(length <= 1) return; // base case

        int middle = length / 2;

        // array size
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i = 0;  // left array
        int j = 0;  // right array

        // splitting the array
        for (i = 0; i < length; i++){

            if( i < middle){
                leftArray[i] = array[i];
            }
            else {
                rightArray[j] = array[i];
                j++;
            }
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);

    }



    private static void merge(int[]  leftArray, int[] rightArray, int[] array) {

        int leftSize = array.length / 2;
        int rightSize = array.length - leftSize;

           int  i = 0,
                l = 0,    // indices
                r = 0;

        // check the conditions for merging
        while (l < leftSize && r < rightSize){

            if (leftArray[l] < rightArray[r] ){
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        while (l < leftSize){
            array[i] = leftArray[l];
            i++;
            l++;
        }

        while (r < rightSize){
            array[i] = rightArray[r];
            i++;
            r++;
        }


    }



}

