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

//Although this is a written assignment, we will also run the program to show the output. And we will also provide the output in the written assignment.
//WE will also provide the output in the written assignment instead of a word document.
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

        // Written assignment section
        System.out.println("\n\n### Module 05 Content");

        // Question 1
        System.out.println("\n#### Question 1");
        System.out.println("\n**Describe differences between breadth-first and depth-first searches**");
        System.out.println("\n- **Breadth-First Search (BFS)**:");
        System.out.println("  - BFS explores all the nodes at the present depth level before moving on to the nodes at the next depth level.");
        System.out.println("  - It uses a queue data structure to keep track of the nodes to be explored.");
        System.out.println("  - BFS is useful for finding the shortest path in an unweighted graph.");


        System.out.println("\n- **Depth-First Search (DFS)**:");
        System.out.println("  - DFS explores as far as possible along each branch before backtracking.");
        System.out.println("  - It uses a stack data structure, either explicitly or implicitly through recursion.");
        System.out.println("  - DFS is useful for pathfinding and topological sorting.");


        //Sequence for the graph
        System.out.println("\n**Provide a sequence for each of the searches for the following graph:**");
        System.out.println("\n    A");
        System.out.println("   / \\");
        System.out.println("  B   C");
        System.out.println(" /   / \\");
        System.out.println("D   E   F");

        System.out.println("\n- **BFS Sequence**: A, B, C, D, E, F");
        System.out.println("\n- **DFS Sequence**: A, B, D, C, E, F");


        //Question 2
        System.out.println("\n#### Question 2");

        System.out.println("\n**For the graphs shown below, provide at least 2 BFS and 2 DFS Traversal Paths for each. See the starting nodes in bold below for each graph.**");


        //Left Graph
        System.out.println("\n**Left Graph**");
        System.out.println("\n1. BFS : 1");
        System.out.println("2. BFS : 4");
        System.out.println("1. DFS : 1");
        System.out.println("2. DFS : 4");


        //Sequence for the left graph
        System.out.println("\n- **BFS from 1**: 1, 2, 3, 4, 5, 6");
        System.out.println("\n- **BFS from 4**: 4, 5, 6, 1, 2, 3");
        System.out.println("\n- **DFS from 1**: 1, 2, 4, 5, 3, 6");
        System.out.println("\n- **DFS from 4**: 4, 5, 1, 2, 3, 6");


        //Right Graph
        System.out.println("\n**Right Graph**");
        System.out.println("\n1. BFS : 1");
        System.out.println("2. BFS : 10");
        System.out.println("1. DFS : 1");
        System.out.println("2. DFS : 10");


        //Sequence for the right graph
        System.out.println("\n- **BFS from 1**: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10");
        System.out.println("\n- **BFS from 10**: 10, 9, 8, 7, 6, 5, 4, 3, 2, 1");
        System.out.println("\n- **DFS from 1**: 1, 2, 4, 5, 3, 6, 7, 8, 9, 10");
        System.out.println("\n- **DFS from 10**: 10, 9, 8, 7, 6, 5, 4, 3, 2, 1");
    }
}