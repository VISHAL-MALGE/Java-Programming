
//      Why Use the File Class?
//    •  To check if a file or directory exists.
//    •  To create or delete files and directories programmatically.
//    •  To retrieve information about files (size, name, path, etc.).
//    •  To perform basic file operations like renaming.

import java.io.FileReader;
import java.io.IOException;


public class File_Class {
    public static void main(String[] args) {

        // file : an abstract representation of file and directory pathname

//        File file = new File("secret_message.txt");
//
//        if(file.exists()){
//            System.out.println("That File Exists! :0!");  // prints if file is in project directory
//            System.out.println(file.getPath()); // file name
//            System.out.println(file.getAbsoluteFile()); // location path of that file
//            System.out.println(file.isFile());
////            file.delete();  // deletes the file from project directory
//        }
//        else {
//            System.out.println("That File Doesn't Exists!  :("); // prints if file not in project directory
//        }



//  Write file : you can write contents in the file
//       try {
//           FileWriter writer = new FileWriter("secret_message.txt");
//           writer.write("Hello, Welcome To My World....\n This Is A Message From Multiverse \n");
//           writer.append("      -  A Message From Jaadu");
//           writer.close();
//
//       }
//
//       catch (IOException e){
//           System.out.println("Error! 404");
//       }






//        FileReader  : read the contents of a file as a stream of characters. One by one
//                      read() returns an int value which contains the byte value
//                      when read() returns -1, there is no more data to be read


        try {
            FileReader reader = new FileReader("art.txt");
            int data = reader.read();

            while( data != -1){
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }




    }
}
