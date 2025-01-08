/*
Recursion : function calls itself to solve smaller parts of a bigger problem.
            It keeps breaking the problem into smaller pieces until it reaches a point
            where it no longer needs to call itself.


            Advantages
            ----------
            - easier to read/write
            - easier to debug


            Disadvantages
            -------------
            - sometimes slower
            - uses more memory


            Use Iteration:
            - When performance is critical.
            - For simple, repetitive tasks like looping through a list.

            Use Recursion:
            - When the problem is naturally recursive, such as solving a tree, graph, or mathematical sequences.
            - When you want cleaner and more intuitive code for problems like factorials or Fibonacci sequences.




*/








package DSA;

public class Recursion {

    public static void main(String[] args){

        System.out.println(factorial(3));
    }


    private static int factorial(int num) {

        if (num < 1) return 1;  // base case
        return num * factorial(num - 1);  // recursive



    }
}
