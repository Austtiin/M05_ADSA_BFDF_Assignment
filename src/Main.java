///*
//
//main.java
// This is the main class that will run the program.

////Austin Stephens
//Rasmussen University
//Professor Kumar
//COT4530C
//08/04/2024
//
//Module 05 Cont
//
//Question 1.
//Describe differences between breadth-first and depth-first searches
//and provide a sequence for each of the searches for the following graph:
//
// A
// / \
//B C
/// / \
//D E F
//
//Question 2.
//For the graphs shown below, provide at least 2 BFS and 2 DFS Traversal Paths for each.
//See the starting nodes in bold below for each graph.
//
//Left Graph
//1. BFS : 1
//2. BFS : 4
//1. DFS : 1
//2. DFS : 4
//
//Right Graph
//1. BFS : 1
//2. BFS : 10
//1. DFS : 1
//2. DFS : 10
//
//
//We will seperate the code into two classes, one for the graph and one for the main method.
//The graph class will contain the graph and the methods to traverse the graph.
//The main class will contain the main method to run the program.
//
// */


public class Main {
    public static void main(String[] args) {

        // Create a graph object and add the edges.
        Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);

        // Print the BFS and DFS traversal of the graph.
        System.out.println("BFS");
        graph.BFS(0);
        System.out.println("\nDFS");
        graph.DFS(0);

        // Create a graph object and add the edges.
        Graph graph2 = new Graph(11);
        graph2.addEdge(0, 1);
        graph2.addEdge(0, 2);
        graph2.addEdge(1, 3);
        graph2.addEdge(1, 4);
        graph2.addEdge(2, 5);
        graph2.addEdge(2, 6);
        graph2.addEdge(3, 7);
        graph2.addEdge(3, 8);
        graph2.addEdge(4, 9);
        graph2.addEdge(4, 10);

        // Print the BFS and DFS traversal of the graph.
        System.out.println("\nBFS");
        graph2.BFS(0);
        System.out.println("\nDFS");
        graph2.DFS(0);
    }
}