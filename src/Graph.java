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

        // Initialize the number of vertices to the graph
        this.vertices = vertices;

        // Create an adjacency list for each vertex
        adjList = new LinkedList[vertices];

        //loop through the vertices and create a new linked list for each vertex
        for (int i = 0; i < vertices; i++) {
            // Create a new linked list for each vertex
            adjList[i] = new LinkedList<>();
        }
    }

    // Method to add an edge to the graph
    public void addEdge(int source, int destination) {
        //We are adding the destination to the source
        adjList[source].add(destination);
    }

    // Method to perform BFS traversal
    public void BFS(int startVertex) {
        // Create a boolean array to keep track of visited vertices
        boolean[] visited = new boolean[vertices];
        //We are creating a linked list to keep track of the vertices
        LinkedList<Integer> queue = new LinkedList<>();


        // Mark the current vertex as visited and add it to the queue
        visited[startVertex] = true;

        // Add the start vertex to the queue
        queue.add(startVertex);


        //While the queue is not empty, we will loop through the vertices
        while (!queue.isEmpty()) {
            // Remove the vertex from the queue and print it
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            // Loop through the adjacent vertices of the current vertex
            for (int adjVertex : adjList[vertex]) {
                // If the adjacent vertex is not visited, mark it as visited and add it to the queue
                if (!visited[adjVertex]) {
                    // Mark the vertex as visited
                    visited[adjVertex] = true;
                    queue.add(adjVertex);
                }
            }
        }
    }

    // Method to perform DFS traversal
    public void DFS(int startVertex) {

        // Create a boolean array to keep track of visited vertices
        boolean[] visited = new boolean[vertices];
        // Call the utility method for DFS traversal
        DFSUtil(startVertex, visited);
    }

    // Utility method for DFS traversal
    private void DFSUtil(int vertex, boolean[] visited) {
        // Mark the current vertex as visited and print it to the console
        visited[vertex] = true;
        System.out.print(vertex + " ");

        // Loop through the adjacent vertices of the current vertex
        for (int adjVertex : adjList[vertex]) {
            if (!visited[adjVertex]) {
                // If the adjacent vertex is not visited, call the utility method recursively
                DFSUtil(adjVertex, visited);
            }
        }
    }
}