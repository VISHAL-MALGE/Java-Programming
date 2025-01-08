
//  Generic Class : A single class can handle different data types.
//                  No need to create separate classes for different types.
//                  Generic classes use type parameters like <T>, <E>, or <K, V>.
//                  T is a placeholder for a type.
//                  The same class works for different data types.


public class Generic_Class {
    public static void main(String[] args){

        MyGenericClass <Integer,Integer> intArray = new MyGenericClass <> (5,7);
        MyGenericClass <String,Character> StrArray = new MyGenericClass <> ("Batman",'V');
        MyGenericClass <Character,Character> ChArray = new MyGenericClass <> ('V','S');
        MyGenericClass <Double,Double> DbArray = new MyGenericClass <> (2.5,2.5);

        System.out.println(intArray.getValue());
        System.out.println(StrArray.getValue());
        System.out.println(ChArray.getValue());
        System.out.println(DbArray.getValue());




    }
}

class MyGenericClass <Thing, Thing2> {

    Thing x;
    Thing2 y;

    MyGenericClass (Thing x, Thing2 y){  // Constructor
        this.x = x;
        this.y = y;
    }


    public Thing2 getValue() {   // Method To Display values
        return y;
    }
}