/*

Adjacency List : An array/arraylist of Linked lists
                - Each LinkedList has a unique node at the head
                - All adjacent neighbors to that node are added to that node's linked list

                - runtime complexity to check an Edge: O(v)
                - space complexity: O(v + e)

*/

package DSA;

import java.util.ArrayList;
import java.util.LinkedList;

public class Adjacency_List {
    public static void main(String[] args){

        Graphs graph = new Graphs(3);

        // Add vertices
        graph.addNode(new Node('A'));   // Creates a node labeled 'A'
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));


        // Add edges
        graph.addEdge(0, 1);   // Adds an edge from node 0 (A) to node 1 (B)
        graph.addEdge(1, 2);
        graph.addEdge(2, 1);
        graph.addEdge(2, 0);


        // Print graph
        graph.printGraph();

        System.out.println(graph.checkEdge(0,2));

    }
}

class Node{
    char data;

    Node(char data){
        this.data = data;
    }
}


class Graphs{

    ArrayList<LinkedList<Node>> alist;

    Graphs(int i){
        alist = new ArrayList<>();

    }


    public void addNode(Node node){

        LinkedList<Node> currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);

    }


    public void addEdge(int src, int dst){
        LinkedList<Node> currentList = alist.get(src);
        Node dstNode = alist.get(dst).get(0);
        currentList.add(dstNode);

    }


    public boolean checkEdge(int src, int dst){

        LinkedList<Node> currentList = alist.get(src);
        Node dstNode = alist.get(dst).get(0);

        for (Node node :currentList){
            if (node == dstNode){
                return true;
            }
        }
        return false;

    }


    public void printGraph(){

        for (LinkedList<Node> currentList : alist){
            for (Node node : currentList){
                System.out.print(node.data + " -> ");
            }
            System.out.println();
        }

    }


}