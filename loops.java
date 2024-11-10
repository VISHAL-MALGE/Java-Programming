import java.lang.reflect.Array;
import java.util.ArrayList;

public class loops {
    public static void main(String[] args){

//  loops : used to

// --------------  FOR LOOP  -------------------------

//        for (int i=0; i<5; i++){
//            System.out.print("BMW M8" + " ");
//        }




// --------------  While Loop  -------------------------

//        int i = 0;
//        while (i<4){
//            System.out.println("\n" + i);
//            i++;
//        }





// --------------  Do While Loop  -------------------------


//        int i = 0;
//        do {
//            System.out.print(0 + " ");
//            i++;
//        }while (i < 3);








// --------------  For-Each Loop  -------------------------
//   for-each: Also calles as Enhanced For Loop, it to iterate through elements in a collection(array or ArrayList)
//             less code, more readable.. BUT less flexible

        String[] car = {"BMW" , "AMG" , "GT3 RS"};     // Array
        ArrayList<String> cars = new ArrayList<>();   // ArrayList

        cars.add("Porsche");
        cars.add("Aston Martin");
        cars.add("Ferrari");

//          datatype    index    collection
        for( String       i    :   cars  ){       // Enhanced for Loop / for-each loop
            System.out.println(i);
        }




    }
}
