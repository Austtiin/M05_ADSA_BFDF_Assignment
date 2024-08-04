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
        Graph graph = new Graph(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);

        System.out.println("BFS");
        graph.BFS(0);
        System.out.println("\nDFS");
        graph.DFS(0);


    }

}