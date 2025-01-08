//  Encapsulation : It hides the data inside a class and allows access to it through methods.
//                  can be accessed only through methods (getters and setters)
//                  Prevents unauthorized or incorrect access to data.
//                  This provides better security, data integrity, and modularity.


class person{

//  The variables name and age are marked private, so they are hidden from other classes.
    private String name;   // Private variable to store the name
    private int age;      // Private variable to store the age

    // constructor
    person(String name, int age){

//  Using setter methods to initialize private variables
        this.setName(name);
        this.setAge(age);

//  for getter methods
//        this.name = name;
//        this.age = age;
    }


//  These methods provide read-only access to the private variables name and age.
//  Public getter for 'name'
    public String getName(){
        return name;   // Returns the private variable 'name'
    }

//  Public getter for 'age'
    public int getAge(){
        return age;  // Returns the private variable 'age'
    }


//  These methods provide write-only access to the private variables name and age.
    public void setName(String name){
        this.name = name;  // Assigns the value to the private variable 'name'
    }

    public void setAge(int age){
        this.age = age;
    }


}


public class Encapsulation_OOPS {
    public static void main(String[] args){

        person p1 = new person("Jack", 27); // Creates a person object with name and age
        System.out.println(p1.getName());
        System.out.println(p1.getAge());

        p1.setName("Bob"); // Updates the name to "Bob"
        p1.setAge(28);

        System.out.println("\nAfter Setting Details\n");

        System.out.println(p1.getName()); // Prints the updated name ("Bob")
        System.out.println(p1.getAge());  // Prints the updated age (28)


    }
}


