import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args){

//  Loops : execute block of Code As long as condition is true

// --------------  FOR LOOP  -------------------------

//        Everything // Initialization, Condition , Update inside brackets
//        for (int i=0; i<5; i++){
//            System.out.print("BMW M8" + " ");
//        }




// --------------  While Loop  -------------------------

//        int i = 0;    // Initialization
//        while (i<4){   // Checks The Condition
//            System.out.println("\n" + i);  // Then Executes The Code
//            i++;  // Update
//        }





// --------------  Do While Loop  -------------------------
//  It Will Execute The Code At least Once, Execute Block Of Code As Long As Condition IS True

//        int i = 0;  // Initialization
//        do {
//            System.out.print(0 + " ");  // Executes The Code
//            i++;  // Update
//        }while (i < 3);   // Then Checks The Condition





// --------------  For-Each Loop  -------------------------
//   for-each: Also calles as Enhanced For Loop, it to iterate through elements in a collection(array or ArrayList)
//             less code, more readable BUT less flexible

        String[] car = {"BMW" , "AMG" , "GT3 RS"};     // Array
        ArrayList<String> cars = new ArrayList<>();   // ArrayList

        cars.add("Porsche");
        cars.add("Aston Martin");
        cars.add("Ferrari");

//          datatype    index    collection
        for( String       i    :   cars  ){       // Enhanced for Loop / for-each loop
            System.out.println(i);
        }



//  -------------------------------------------------------
//      NESTED LOOPS : A Loop Inside A Loop

        System.out.print("Enter The Rows : ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.print("Enter The Columns : ");
        int columns = sc.nextInt();
        char s = '*';

        for (int i=1; i<=rows; i++){    // Outer Loop
            System.out.println();  // After Printing no. of columns , it moves to next line
            for (int j=1; j<=columns; j++){  // Inner Loop
                System.out.print(s);
            }
        }


    }
}
