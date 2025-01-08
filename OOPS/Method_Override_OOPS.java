//   Method Override : a subclass (child class) provides a specific implementation of a method
//                     that is already defined in its superclass (parent class).
//                     The method signature must be exactly the same as in the parent class.


public class Method_Override_OOPS {
    public static void main(String[] args){

        animal human = new animal();
        dog dog = new dog();

        human.speak();
        dog.speak();      // in method override it calls the closest method in the class

    }
}


class animal{

    void speak(){
        System.out.println("The Animal Speaks");
    }

}

class dog extends animal{   // inherited animal class

    @Override      // Just to indicate this method is overridden
    void speak(){
        System.out.println("The Dog Barks");  // Overriding the statement
    }

}