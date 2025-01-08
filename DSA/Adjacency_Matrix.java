/*

    Adjacency Matrix : A 2D array where Rows and columns represent vertices


*/



package DSA;

import java.util.ArrayList;

public class Adjacency_Matrix {
    public static void main(String[] args){

        // Create a graph with 3 nodes
        Graph graph = new Graph(3);

        // Add vertices
        graph.addNode(new Nodes('A'));   // Creates a node labeled 'A'
        graph.addNode(new Nodes('B'));
        graph.addNode(new Nodes('C'));


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

class Nodes{

    char data;  // Initialize the node with a character label

    Nodes(char data){
        this.data = data;
    }

}


class Graph{

    ArrayList<Nodes> nodes;
    int[][] matrix;

    Graph(int size){
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }

    public void addNode(Nodes node){
        nodes.add(node);    // Add the node to the list

    }

    public void addEdge(int src , int dest){
        matrix[src][dest] = 1;    // Mark an edge from src to dest
    }


    public boolean checkEdge(int src , int dest){

        if (matrix[src][dest] == 1){
            return true;
        }
        else{
            return false;
        }

    }


    public void printGraph(){

        // Print header row (node labels)
        System.out.print("  ");
        for(Nodes nodes : nodes){
            System.out.print(nodes.data + " ");
        }
        System.out.println();

        // Print each row of the matrix
        for (int i =0; i< matrix.length; i++){

            // Print the node label for the row
            System.out.print(nodes.get(i).data + " ");

            for (int j =0; j< matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}



