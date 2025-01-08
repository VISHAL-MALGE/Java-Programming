
/*

    Stacks : A linear data structure that follows the LIFO (Last In, First Out) principle
             The last item added to the stack is the first to be removed

             ----------  Basic Operations  ------------
             Push: Add an element to the top of the stack.
             Pop: Remove the element from the top of the stack.
             Peek/Top: View the top element without removing it.
             IsEmpty: Check if the stack is empty.


             --------  Time Complexity  ------------
             Push, Pop, Peek: O(1) (constant time)


             ----------  Use of Stacks ---------
             Undo/Redo functionality in text editors.
             Backtracking in mazes or puzzles.
             Function call management in recursion.


 */



package DSA;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args){

        Stack<String> stack = new Stack<>();

        stack.push("MineCraft");
        stack.push("Uncharted");
        stack.push("Resident Evil");
        stack.push("God Of War");
        stack.push("RDR 2");


        System.out.println("Stack Empty? : " + stack.isEmpty());
        System.out.println("\nStack : " + stack);
        System.out.println("\nTop Element : " + stack.peek());

        stack.pop();   // Removes the last element

        System.out.println("\nAfter Pop : " + stack);
        System.out.println("Contains : " + stack.elementAt(3));  // can access through index
    }

}
