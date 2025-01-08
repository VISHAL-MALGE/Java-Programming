//  Class : A class is a blueprint or a template for creating objects.
//          It defines what properties (fields) and behaviors (methods) objects created from it will have.


//  Object : An object is an instance of a class.
//           You can create many objects from a single class,
//           each object can have different values for its properties.



class car{           // this is a class 'car'

    String brand = "BMW";   // these are attributes
    String model = "M8 Competition";
    String color = "BLUE";
    int price = 12000000;


    void drive(){     // this is object that performs a task
        System.out.println("You are driving");

    }

    void stop(){     // this is object that performs a task
        System.out.println("You applied brakes");
    }

}




public class Object_OOPS {        // this is main class

    public static void main(String[] args){


        car bmw = new car();    // this is object
        car amg = new car();   // can create multiple object from a single class 'car'

        System.out.println(amg.color);

        System.out.println(bmw.brand); // calling the attributes
        System.out.println(bmw.model);

        bmw.drive();  // calling the Method function



    }
}
