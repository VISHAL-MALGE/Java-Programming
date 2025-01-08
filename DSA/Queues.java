/*
    Queues : A linear data structure that follows the FIFO (First In, First Out)
             the element added first is removed first

             ------------  Key Queue Operations  -------------
             Enqueue: Add an element to the rear (end) of the queue
             Dequeue: Remove an element from the front of the queue
             Peek/Front: View the front element without removing it
             IsEmpty: Check if the queue is empty


             ---------  Time Complexity  -----------------
             Enqueue, Dequeue, Peek: O(1) (constant time)


             --------  Use of Queues  ----------
             CPU scheduling.
             Printer task management.
             Customer service management


*/


package DSA;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {
    public static void main(String[] args){

        Queue<String> queue = new LinkedList<>();

        queue.offer("Jack");     // Adds Element
        queue.offer("Oggy");     // Add : enqueue, offer
        queue.offer("Bob");      // Remove : dequeue, poll
        queue.offer("Olivia");

        System.out.println("Queue : " + queue);
        System.out.println("First Element : " + queue.peek());

        queue.poll();
        System.out.println("After Dequeue : " + queue);

        System.out.println("Queue Empty : " + queue.isEmpty());
        System.out.println("Queue Size : " + queue.size());

        System.out.println("It Contains : " + queue.contains("Bob"));



/*  *******************************************************************************************


    Priority Queue : A FIFO data structure that serves elements highest priority
                     before elements with the lowest  priority

                     ----------- Operations Priority Queue ------------
                     Insert (Enqueue): Add an element based on priority.
                     Remove (Dequeue): Remove the element with the highest priority.
                     Peek: View the element with the highest priority.

                     ----------  Types of Priority Queues ----------
                     Min-Heap : The element with the lowest value has the highest priority.


                     ------------  Use of Priority Queues  --------------
                     Task Scheduling (like CPU process management).
                     Pathfinding algorithms (like Dijkstra's Algorithm).
                     Event-driven simulations.
                     Job scheduling in operating systems.

 */


        //   Min-Heap Priority Queue
        Queue<String> prqueue = new LinkedList<>();

        prqueue.offer("S");
        prqueue.offer("A");
        prqueue.offer("B");

        System.out.println(prqueue);


        // Max-Heap Priority Queue
        Queue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        priorityQueue.offer(7);
        priorityQueue.offer(5);
        priorityQueue.offer(2);

        System.out.println("\npriority Queue");

        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }



    }
}
