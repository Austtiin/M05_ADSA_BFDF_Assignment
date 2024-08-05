//Graph.java
//This class will contain the graph and the methods to traverse the graph.
//

//Austin Stephens
//Rasmussen University
//Professor Kumar
//COT4530C
//08/04/2024


import java.util.*;

public class Graph {
    private final int vertices;
    private final LinkedList<Integer>[] adjList;

    // Constructor to initialize the graph
    public Graph(int vertices) {

        //WE need to initialize the graph with the number of vertices.
        this.vertices = vertices;
        adjList = new LinkedList[vertices];

        for (int i = 0; i < vertices; i++) {
            //loop through the vertices and create a linked list for each vertex.
            adjList[i] = new LinkedList<>();
        }
    }

    // Method to add an edge to the graph
    public void addEdge(int source, int destination) {
        //add an edge to the graph.
        adjList[source].add(destination);
    }

    // Method to perform BFS traversal
    public void BFS(int startVertex) {
        //have to create a boolean array to keep track of the visited vertices.
        boolean[] visited = new boolean[vertices];
        LinkedList<Integer> queue = new LinkedList<>();

        //keep track of the visited vertices and add the start vertex to the queue.
        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            //loop through the queue and add the adjacent vertices to the queue.
            int vertex = queue.poll();
            System.out.print(vertex + " ");


            //for each adjacent vertex, check if it has been visited and add it to the queue.
            for (int adjVertex : adjList[vertex]) {

                //if the vertex has not been visited, add it to the queue.
                if (!visited[adjVertex]) {
                    visited[adjVertex] = true;
                    queue.add(adjVertex);
                }
            }
        }
    }


    // Method to perform DFS traversal
    public void DFS(int startVertex) {
        //we have to create a boolean array to keep track of the visited vertices.
        boolean[] visited = new boolean[vertices];

        //need ot call the utility method to perform the DFS traversal.
        DFSUtil(startVertex, visited);
    }

    // Utility method for DFS traversal
    private void DFSUtil(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");


        //for each adjacent vertex, check if it has been visited and perform the DFS traversal.
        for (int adjVertex : adjList[vertex]) {
            if (!visited[adjVertex]) {
                DFSUtil(adjVertex, visited);
            }
        }
    }
}