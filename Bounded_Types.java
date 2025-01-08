
//  Bounded Types : Ensure only specific types can be passed as arguments
//                  restrict the type parameters in generics so that they must meet specific conditions,
//                  like being a subclass of a particular class or implementing a certain interface.
//
//


public class Bounded_Types {
        public static void main(String[] args){

//      Only Numbers can pass Arguments
        MyBounded <Integer> intArray = new MyBounded<>(5);
        MyBounded <Double> DbArray = new MyBounded<>(2.7);


//        MyBounded <String> StrArray = new MyBounded<>("Batman");
//        MyBounded <Character> ChArray = new MyBounded<>('S');


        System.out.println(intArray.getValue());
        System.out.println(DbArray.getValue());

//        System.out.println(StrArray.getValue());
//        System.out.println(ChArray.getValue());

        }
    }

    class MyBounded <Thing extends Number> {

        Thing x;

        MyBounded(Thing x){  // Constructor
            this.x = x;
        }


        public Thing getValue() {   // Method To Display values
            return x;
        }
    }

