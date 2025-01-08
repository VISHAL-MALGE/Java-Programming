//  Object passing: the process of passing objects as arguments to methods.
//                  When you pass an object to a method
//                  When you pass an object to a method
//                  When you pass an object to a method

public class Object_Passing {

    public static void main(String[] args){

        // Object Creation in main Method
        Garage garage = new Garage();  // creates a new instance of Garage.
        Cars bmw = new Cars("M8"); // creates a new Cars object with name = "M8"

        // Method Call
        garage.park(bmw); // calls the park method on the garage object, passing bmw as an argument.

    }

}


class Garage{

    void park(Cars s){   // receives bmw as the parameter 's'

        // s.name refers to the name attribute of bmw, which is "M8"
        System.out.println("The " + s.name+ " is parked in the garage");
    }

}


class Cars{

    String name;  // Attribute (Instance variable)

    Cars(String car) {   // Constructor
        name = car;
    }

}