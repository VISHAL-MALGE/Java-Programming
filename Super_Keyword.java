//   super : The super keyword in Java is used in subclasses (child classes)
//     --    to refer to the immediate parent class (superclass).
//     --    It helps to access methods, variables, and constructors
//     --    of the parent class from the child class.

//     --    This approach avoids duplicating code and leverages inheritance for cleaner code structure.



public class Super_Keyword {
    public static void main(String[] args){

        hero hero1 = new hero("Batman",45,"Money");
        hero hero2 = new hero("Ironman",45,"Genius");

        System.out.println(hero1);
        System.out.println();
        System.out.println(hero2);

    }
}

// Parent Class
class humans{
    String name;
    int age;

    humans(String name, int age){   // constructor
        this.name = name;
        this.age = age;
    }

    public String toString(){  // converts the object into readable String format
        return this.name + "\n" + this.age + "\n";
    }

}

// Child Class
class hero extends humans{

    String power;

    hero(String name, int age, String power){    // constructor

//      simpler by reusing the parent class constructor

        super(name, age);  // calls the parent class's constructor humans(String name, int age)
        this.power = power;
    }

    public String toString(){  // converts the object into readable String format

//      super.toString() calls the toString() method of the parent class
//      humans to get the name and age values as a string.

        return super.toString()+this.power;

//      Then, this.power is added to the string,
//      providing a full description for the hero object.

    }

}