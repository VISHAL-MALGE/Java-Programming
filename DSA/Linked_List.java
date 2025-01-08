
/*
    Linked List : A linear data structure where elements (called nodes) are connected using pointers
                  stores Nodes in 2 parts (data + address)
                  nodes are in non-consecutive memory locations
                  Elements are linked using pointers

                  ----------  Each node contains  ----------
                  Data: The actual value.
                  Pointer/Next: A reference (address) to the next node in the list


                  ------------  Why Use Linked Lists? -------------
                  Dynamic Size: Can grow or shrink as needed.
                  Efficient Insertion/Deletion: Easier than arrays (no need to shift elements)


                  ----------  Types of Linked Lists  ---------------------

                  Singly Linked List: Each node points to the next node.

                       Node                 Node                    Node
                  [Data | address] ->  [Data | address]   ->   [Data | address]


                  Doubly Linked List: Each node points to both the next and previous nodes.

                             Node                               Node
                  [address | Data | address]  <->   [address | Data | address]


                  Circular Linked List: The last node points back to the first node.


                  ----------  Basic Operations in Linked Lists  --------------
                  Insertion: Add a node at the beginning, end, or a specific position.
                  Deletion: Remove a node from the beginning, end, or a specific position.
                  Traversal: Visit each node to read its data.
                  Search: Find a specific value in the list

                  -------------  Use Cases -------------
                  implements stacks/queues
                  GPS navigation
                  Music playlist

*/


package DSA;

import java.util.LinkedList;

public class Linked_List {
    public static void main(String[] args){

        LinkedList<String> linkedlist = new LinkedList<>();

    /*  linkedlist.add("A");
        linkedlist.add("B");   // add elements in the list
        linkedlist.add("D");

        linkedlist.pop();  // to delete element from list

     */

        linkedlist.offer("A");
        linkedlist.offer("B");
        linkedlist.offer("D");
        linkedlist.offer("F");

        linkedlist.poll();   // removes 1st element from list

        linkedlist.add(2,"C");  // add at Specific place

        linkedlist.remove("F");    // remove specific element

        linkedlist.addFirst("S");  // Add element in 1st place (head)
        linkedlist.addLast("V");   // Add element in last place (tale)


        System.out.println(linkedlist.peekFirst());  // access first element from list
        System.out.println(linkedlist.peekLast());   // access last element from list

        System.out.println(linkedlist);

    }
}
