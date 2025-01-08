
// Exception : an event that occurs during the execution of a program and disrupts its normal flow.
//             Exception handling ensures that errors don't crash your program.



import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Handle {
    public static void main(String[] args ){


        Scanner sc = new Scanner(System.in);
        try {


            System.out.print("Enter A Number : ");
            int x = sc.nextInt();

            System.out.print("Enter A Number To Divide : ");
            int y = sc.nextInt();

            int result = x / y;

            System.out.println( x + "/" + y + " = " + result);


        }

        // this is individual exception handle
        catch (ArithmeticException e){
            System.out.println("Cannot Divide By Zero!");  // it only handles Arithmetic errors
        }


        // this is individual exception handle
        catch(InputMismatchException e){
            System.out.println("Enter A Valid Number..");  // it handles input mismatch errors

        }


        catch (Exception e) {  // it Handles Every error
            System.out.println("Error! ");
        }

        finally {  // This block contains code that will always execute,
            sc.close();
            System.out.println("This line always executes....");

        }





    }
}




//    1.  try block :
//        • The code that may cause an exception is placed inside the try block.
//        • It monitors for exceptions.


//    2.  catch block:
//        • This block contains the code to handle the exception.
//        • It executes only when an exception occurs in the try block.


//    3.  finally block :
//        • This block contains code that will always execute,
//        • regardless of whether an exception occurs or not.
//        • It is typically used to release resources like closing files, releasing memory, etc.


//      Why Use Exception Handling?

//      To prevent program crashes.
//      To provide custom error messages for better debugging.
//      To ensure the program runs smoothly even if errors occur.
//      To separate error-handling logic from the normal program flow.