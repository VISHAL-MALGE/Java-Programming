import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args){

//        ArrayList : a resizable array-like structure.
//                    Elements can be added, remove , or manipulate them
//                    Stores References data types / Wrapper Class

        ArrayList<String> car = new ArrayList<>();

        car.add("BMW");
        car.add("GTR");
        car.add("AMG GT");
        car.add("PORSCHE");
        car.add("ASTON MARTIN");

        // -------- Methods --------

        car.set(1,"AUDI");   // it will set new value through index no.
        car.remove(1);  // it will remove the value through index no.
//        car.clear();     // it will clear all the elements in the ArrayList
        String a = car.get(2);  // it will print the element from the index no.
        System.out.println(a);

        System.out.println(car);  // Print car Array List


        for (int i=0; i< car.size(); i++){
            System.out.println(car.get(i));    // Get function used to print ArrayList
        }


    }
}
