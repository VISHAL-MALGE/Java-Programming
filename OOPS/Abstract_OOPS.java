
//  Abstract : An abstract method is a method declared using the abstract keyword without a body (no curly braces {}).
//             It cannot be instantiated directly, means you cannot create objects of an abstract class.
//             It is meant to be inherited by other classes,
//             which provide implementations for its abstract methods.

//             It only has a declaration,
//             child classes must override this method to provide the actual implementation.



public class Abstract_OOPS {
    public static void main(String[] args){


//        food apple = new food();

        juice mango = new juice();  // An object of the juice class is created.

        mango.fruits();  // The fruits() and cake() methods of the juice class are called.
        mango.cake();  // Calls the overridden cake() method in the juice class

    }
}


// Abstract Class
abstract class food{

    abstract void fruits();    // Abstract method with no body (must be implemented by subclasses)

    void cake(){  // Concrete method (can be used or overridden by subclasses)
        System.out.println("This Is Black Forest Cake...");
    }
}


class juice extends food{

    @Override
    void fruits() {   // It provides an implementation for the fruits() method (required because fruits() is abstract).
        System.out.println("This Is Mango Juice...");
    }


    // Although cake() has a body in the parent class,
    // the juice class overrides it to provide a different task
    @Override
    void cake() {
        System.out.println("This Is Hazel Nuts Cake...");
    }
}
