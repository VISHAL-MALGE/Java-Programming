//        Steps to Deserialize
//        ----------------------------------------------------------------
//        Declare your object (don't instantiate)
//        Your class should implement Serializable interface
//        add import java.io.serializable;
//        FileInputStream file_in = new FileInputStream(fi1e path);
//        ObjectInputStream in = new ObjectInputStream(file_in);
//        objectNam = (Class) in.readObject();
//        in. close(); file_in.close();
//        ----------------------------------------------------------------


import java.io.*;

public class Deserializer {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        Users users = null;

        FileInputStream file_in = new FileInputStream("src/UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(file_in);

        users = (Users) in.readObject();

        in.close();
        file_in.close();

        System.out.println(users.name);
        System.out.println(users.password);
        users.Info();


    }
}

class Users implements Serializable {

    String name;
    String password;

    void Info(){
        System.out.println("Hello " + name);

    }
}