package DSA;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linked_Array_List {
    public static void main(String[] args){


        LinkedList <Integer> linkedList = new LinkedList <Integer> ();
        ArrayList <Integer> arrayList = new ArrayList <Integer> ();

        long startTime;
        long endTime;
        long elapsedTime;

        for(int i=0; i<1000000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }

//  ******************  Linked List **********************

        startTime = System.nanoTime();

//        linkedList.getFirst();
//        linkedList.getLast();
//        linkedList.get(99999);
        linkedList.remove(750000);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;
        System.out.println("Linked List : " + elapsedTime + " nSec");



//  ******************  Array List  **********************

        startTime = System.nanoTime();

//        arrayList.getFirst();
//        arrayList.getLast();
//        arrayList.get(99999);
        arrayList.remove(750000);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;
        System.out.println("Array List : " + elapsedTime + " nSec");

    }
}
