//        The static keyword in Java is used to create variables, methods
//        blocks of code that belong to the class itself rather than instances (objects) of the class.
//        This means that static members are shared among all instances (objects) of the class and can be accessed without creating an object of the class.



public class Static_Method {
    public static void main(String[] args){

        counter num1 = new counter();
        counter num2 = new counter();
        counter num3 = new counter();
        counter num4 = new counter();
        counter num5 = new counter();

        System.out.println(counter.count); // Prints the value of the static variable `count`

        counter.display(); // Calls the static method `display()`

    }
}


class counter{

    int num;   // Instance variable (non-static)
    static int count;  // Static variable shared by all instances (object)


    // Constructor
    counter(){
        count++;  // Increment `count` every time a `counter` object is created
    }

    // Static method
    static void display(){
        System.out.println("You have " + count + " Cars" );
    }
}