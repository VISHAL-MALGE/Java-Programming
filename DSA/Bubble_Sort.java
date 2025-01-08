
/*

Bubble Sort : Bubble Sort is a simple sorting algorithm that repeatedly steps through the list,
              compares adjacent elements, and swaps them if they are in the wrong order.
              The process is repeated until the list is sorted.


            ------- How It Works ------------
            Start with the first two numbers in the list.
            Compare them:
            If the first number is bigger, swap them.
            If not, do nothing.

            Move to the next pair and repeat the process.
            Keep doing this until the whole list is sorted.

            - it's okay with Small DataSet
            - Not good for Large DataSet

            ---------- Example with Numbers ---------------
            Starting list: [5, 3, 8, 4, 2]

            Compare 5 and 3 → Swap :      [3, 5, 8, 4, 2]
            Compare 5 and 8 → No Swap :   [3, 5, 8, 4, 2]
            Compare 8 and 4 → Swap :      [3, 5, 4, 8, 2]
            Compare 8 and 2 → Swap :      [3, 5, 4, 2, 8]

            Repeat this process until the list becomes: [2, 3, 4, 5, 8]


 */


package DSA;

public class Bubble_Sort {
    public static void main(String[] args){

//        String s = "VISHAL";
//        String reverse = "";
//
//        int size = s.length() - 1;
//
//        for (int i=size;  i>=0; i-- ){
//            reverse += s.charAt(i);
//        }
//
//        System.out.println("REverse String : " + reverse) ;

        int[] bubble = {8,7,4,3,1,9};

        bubbleSort(bubble);

        for (int i : bubble){
            System.out.print(i + " ");
        }




    }



    public static void bubbleSort(int bubble[]){

        for (int i=0; i< bubble.length - 1; i++){
            for (int j=0; j< bubble.length - i - 1; j++){

                if(bubble[j] < bubble[j+1]){     // For Ascending Order
//                 bubble[j] < bubble[j+1]    // For Descending Order
                    int temp = bubble[j];
                    bubble[j] = bubble[j+1];
                    bubble[j+1] = temp;
                }
            }
        }

    }


}
