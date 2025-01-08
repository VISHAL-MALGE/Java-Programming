//   constructor: special method in a class that is automatically called
//                when you create a new object of that class
//                They have the same name as the class and no return type.
//                Automatically called when you create an object with new.

//  constructor overloading: multiple constructors in a class, with name as the class.
//                           but constructors with different parameter lists
//                           name + parameter = signature


class human{    // defined a class named human

    // attributes (also called fields)
    String name;
    int age;
    String car;



//     constructor with same parameter names as attributes
//     Use 'this' keyword when parameter names are same as attributes to distinguish between the two.

    human(String name , int age){    // 2 parameters
        this.name = name;
        this.age = age;
    }

    human(String name){    // 2 parameters
        this.name = name;

    }


//      Constructor with diff parameters than attributes
//      No need for 'this' keyword when the parameter names are different from the attributes.
    human(String myname, int myage, String mycar){     // 3 parameters
        name = myname;
        age = myage;
        car = mycar;      // should not have same no. of parameters as other constructors
    }

    void show(){
        System.out.println("The name is : " + name);
        System.out.println("Age : " + age);
        System.out.println("Car : " + car);
    }
}



public class Constructor_OOPS {   // main class

    public static void main(String[] args){

        human man = new human("Vishh",22, "BMW M8 COMPETITION");   // object with 'human' using the constructor.
        man.show();   // This calls the show() method on the man object,

        human man2 = new human("Vishh");
        man2.show();

    }
}
