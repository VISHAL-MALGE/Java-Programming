// Serialization : the process of converting an object into a byte stream
//                 Saved to a file,  Sent over a network ,  Persisted for later use
//                 The reverse process (byte stream back to object) is called Deserialization.

//      Why Use Serialization?
//      To save the state of an object to a file or database.
//      To send objects over a network, such as in distributed systems.



//        Steps to Serialize
//        ----------------------------------------------------------------
//        1.  Your object class should implement Serializable interface
//        2.  add import java.io.Serializable;
//        3.  FileOutputStream fileOut = new FileOutputStream(file path)
//        4.  ObjectOutputStream out = new ObjectOutputStream(fileOut);
//        5.  out . writeObject(objectName)
//        6.  out. close(); fileOut.cl0se();
//        -----------------------------------------------------------------


//      Important Notes :
//      1. children classes of a parent class that implements Serializable will do so as well
//      2. static fields are not serialized (they belong to the class, not an individual object)
//      3. the class's definition ("class file") itself is not recorded, cast it as the object type
//      4. Fields declared as "transient" aren't serialized, they're ignored
//      5. serialVersionUID is a unique version ID


import java.io.*;

public class Serializer {
    public static void main(String[] args) throws IOException {

        User user = new User();

        user.name = "Batman";
        user.password = "I<300";

        FileOutputStream file_out = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(file_out);
        out.writeObject(user);
        out.close();
        file_out.close();


        System.out.println("The User Info Saved! :)");

    }
}



class User implements Serializable {

    String name;
    String password;

    void Info(){
        System.out.println("Hello " + name);

    }
}