//  Polymorphism : Greek word,  Poly = Many  , Morph = Forms
//                 the ability of an object to identify as more than one type
//                 Code Reusability, Easily extend functionality
//                 Flexibility: Enables dynamic method calls at runtime.

//        Types of Polymorphism in Java

//        1. Compile-Time Polymorphism (Static Polymorphism):
//        • Achieved through method overloading.
//        • The decision of which method to call is made at compile time.

//        2. Run-Time Polymorphism (Dynamic Polymorphism):
//        • Achieved through method overriding.
//        • The decision of which method to call is made at runtime.




public class Polymorphism_OOPS {
    public static void main(String[] args){

        suv amg = new suv();
        bike hero = new bike();
        boat titanic = new boat();

//  Create an array of the parent class 'transport' to store objects of child classes
        transport[] moves = {amg, hero, titanic};

        for (transport x : moves){  // Enhanced For Loop
            x.go(); // Calls the 'go()' method based on the actual object type (polymorphism)
        }



    }
}


class transport{

    void go(){
        System.out.println("transport from one place to another");
    }
}

class suv extends transport{

    @Override
    void go(){
        System.out.println("The cars can go from one place to another");
    }
}

class bike extends transport{

    @Override
    void go(){
        System.out.println("The bikes can go from one place to another");
    }
}

class boat extends transport{

    @Override
    void go(){
        System.out.println("The boats can go from one place to another");
    }

}

//      This demonstrates Run-time Polymorphism where the method that gets
//      called depends on the actual object type, not the reference type.