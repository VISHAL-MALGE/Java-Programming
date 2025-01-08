/*

    Linear Search : A simple searching method where you check each element in a list one by one
                    until you find the target element or reach the end of the list.

                    Run Time Complexity: O(n)

                    Disadvantages : Slow for large data sets

                    Advantages :
                    - Fast for searches of small to medium data sets
                    - Does not need to sorted
                    - Useful for data structures that do not have random access (Linked List)


*/


package DSA;

public class Linear_Search {
    public static void main(String[] args){

        int[] array = {3,9,5,7,2};

//        for (int x : array){
//            if (x == 5){
//                System.out.print(x + " Found!");
//            }
//        }

        int index = linearSearch(array, 1);

        if (index != -1){
            System.out.print("Element Found At Index : " + index);
        }
        else {
            System.out.println("Element Not Found :(");
        }


    }



    public static int linearSearch(int[] array, int value) {

        for (int i=0; i< array.length; i++){
            if (array[i] == value){
                return i;
            }
        }
        return -1;
    }
}
