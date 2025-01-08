//  Interface : An interface in Java is like a blueprint for a class.
//              It defines a set of methods that a class must implement,
//              The class must provide implementations for all the methods declared in the interface.


public class Interface_OOPS {
    public static void main(String[] args){

//  When an object of Dog is created,
//  it can call the methods defined in the Animal interface.

        tiger bob = new tiger(); // object of Dog is created
        bob.sound();
        bob.eat();
        bob.play();


    }
}



// Defining an interface
interface wild{

//  The wild interface defines two abstract methods: sound() and eat().

    void sound(); // Abstract method (no-body)
    void eat();   // Abstract method (no-body)

}

// interface
interface play{
    void play();
}


// Implementing the Multiple interface in a class
class tiger implements wild,play {

//  The Dog class uses the implements keyword to provide
//  implementations for both methods.


    @Override
    public void sound() {
        System.out.println("Tiger Roars ");
    }

    @Override
    public void eat() {
        System.out.println("Tiger Eats Meat..");
    }

    public void play(){
        System.out.println("Its A Wild Animal..");
    }
}










