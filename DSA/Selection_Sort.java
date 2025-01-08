/*

Selection Sort : selecting the smallest item from a pile and placing it at the beginning, one by one.


        - Okay For Small Data Set
        - Not Good For Large Data Set

        ------- How It Works --------
        - Find the smallest number in the list.
        - Swap it with the first number.
        - Find the next smallest number in the remaining list.
        - Swap it with the second number.
        - Keep doing this until the whole list is sorted.
        - The list gets sorted from left to right.


        --------------- Example with Numbers ------------
        - Starting list: [5, 3, 8, 4, 2]

        - Find the smallest number → 2 → Swap with 5 : [2, 3, 8, 4, 5]
        - Find the next smallest number → 3 :          Already in place
        - Find the next smallest → 4 → Swap with 8 :   [2, 3, 4, 8, 5]
        - Find the next smallest → 5 → Swap with 8 :   [2, 3, 4, 5, 8]


*/



package DSA;

public class Selection_Sort {
    public static void main(String[] args){

        int[] select = {8, 5, 9, 3, 2, 1};

        selectionSort(select);

        for (int i : select){
            System.out.print(i + " " );
        }

    }




    public static void selectionSort(int select[]){

        for (int i=0; i< select.length - 1; i++){
            int min = i;

            for (int j = i+1; j < select.length; j++){
                if (select[min] > select[j]){     // For Ascending Order use ' < ' for Descending Order
                    min = j;
                }
            }

            int temp = select[i];
            select[i] = select[min];
            select[min] = temp;
        }



    }





}
