
/*

Insertion Sort : Sorted list one element at a time. It picks elements from the unsorted part and
                 inserts them into their correct position in the sorted part.


        --------- Example with Numbers -------------
        Starting list: [5, 3, 8, 4, 2]

        1. Start with 3 (second element):
            • Compare 3 with 5 → Insert 3 before 5 : [3, 5, 8, 4, 2]

        2. Move to 8 → Already in the correct position.

        3. Move to 4 :
            • Compare 4 with 8 → Move 8 up.
            • Compare with 5 → Move 5 up.
            • Insert 4 : [3, a, 5, 8, 2]

        4. Move to 2 :
            • Compare 2 with 8, 5, 4, and 3 : Move them all up.
            • Insert 2 : [2, 3, 4, 5, 8]


            - Okay with Small Data Set
            - Not Good For Large Data Set


*/


package DSA;

public class Insertion_Sort {

    public static void main(String[] args){

        int[] insert = { 1 , 6, 8, 2, 9, 5, 3};

        insertionSort(insert);

        for (int i : insert){    // Enhanced For Loop
            System.out.print(i + " ");
        }
    }


    public static void insertionSort(int insert[] ){

        for (int i = 1; i < insert.length; i++){

            int temp = insert[i];
            int j = i - 1;

            while( j >= 0 && insert[j] > temp){
                insert[j + 1] = insert[j];
                j--;
            }
            insert[j + 1] = temp;
        }

        
    }


}
