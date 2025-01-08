
public class Inheritance_OOPS {
    public static void main(String[] args){

//  Inheritance : used to inherit properties, methods of one class to another class


        carr c = new carr();  // object
        cycle b = new cycle();


        b.go();  // calling the go() method
        c.stop();
        System.out.println(c.speed);
        System.out.println(b.wheels);


    }
}


class vehicle{   // parent class / super class

    double speed = 275;    // attribute

    void go(){
        System.out.println("The Vehicle is moving");
    }

    void stop(){
        System.out.println("The Vehicle is stopped");
    }


}


class carr extends vehicle{   // use 'extends' to access the properties & methods of one class

//    inheriting properties, methods of vehicle class

    int wheels = 4;


}

class cycle extends vehicle{

    //    inheriting properties, methods of vehicle class

    int wheels = 2;


}