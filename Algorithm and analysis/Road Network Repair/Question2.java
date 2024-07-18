import java.util.*;

// Class to represent a road connection
class Edge implements Comparable<Edge> {
    int source, destination, cost;

    public Edge(int source, int destination, int cost) {
        this.source = source;
        this.destination = destination;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge other) {
        return Integer.compare(this.cost, other.cost);
    }
}

public class Question2 {
    public static void main(String[] args) {
        int numVertices = 22; // Number of cities
        ArrayList<Edge> edges = new ArrayList<>();


        //Edges ffrom Question 1 and their maintenance costs
        edges.add(new Edge(1, 2, 7));
        edges.add(new Edge(1, 3, 13));
        edges.add(new Edge(1, 7, 35));
        edges.add(new Edge(3, 2, 9));
        edges.add(new Edge(3, 4, 16));
        edges.add(new Edge(3, 5, 19));
        edges.add(new Edge(4, 5, 25));
        edges.add(new Edge(5, 6, 22));
        edges.add(new Edge(5, 10, 5));
        edges.add(new Edge(5, 7, 7));
        edges.add(new Edge(10, 9, 18));
        edges.add(new Edge(9, 7, 14));
        edges.add(new Edge(7, 8, 32));
        edges.add(new Edge(17, 16, 76));
        edges.add(new Edge(16, 15, 44));
        edges.add(new Edge(16, 13, 11));
        edges.add(new Edge(16, 18, 20));
        edges.add(new Edge(18, 19, 3));
        edges.add(new Edge(18, 20, 30));
        edges.add(new Edge(20, 21, 4));
        edges.add(new Edge(21, 22, 12));
        edges.add(new Edge(15, 13, 8));
        edges.add(new Edge(15, 14, 6));
        edges.add(new Edge(13, 14, 21));
        edges.add(new Edge(13, 12, 17));
        // Additional repair costs from Table 1
        edges.add(new Edge(10, 5, 24)); // Y - K
        edges.add(new Edge(11, 9, 10)); // J - P
        edges.add(new Edge(11, 8, 42)); // J - H
        edges.add(new Edge(12, 8, 25)); // N - H
        edges.add(new Edge(11, 4, 31)); // J - E
        edges.add(new Edge(21, 7, 34)); // G - K

        // Setting data structures for Prim's algorithm
        boolean[] visited = new boolean[numVertices + 1];
        PriorityQueue<Edge> minHeap = new PriorityQueue<>();
        int totalCost = 0;

        // Start with an arbitrary vertex (e.g., City 1)
        int startVertex = 1;
        visited[startVertex] = true;

        // Add all edges connected to the start vertex to the priority queue
        for (Edge edge : edges) {
            if (edge.source == startVertex || edge.destination == startVertex) {
                minHeap.add(edge);
            }
        }

        // Implementation Prim's algorithm 
        while (!minHeap.isEmpty()) {
            Edge minEdge = minHeap.poll();
            int currentVertex = visited[minEdge.source] ? minEdge.destination : minEdge.source;

            if (!visited[currentVertex]) {
                visited[currentVertex] = true;
                totalCost += minEdge.cost;

                // Add all edges connected to the current vertex to the priority queue
                for (Edge edge : edges) {
                    if ((edge.source == currentVertex || edge.destination == currentVertex) && !visited[edge.destination]) {
                        minHeap.add(edge);
                    }
                }
            }
        }

        // Printout the minimum cost
        System.out.println("Minimum cost of connecting all cities after repairs: " + totalCost);
    }
}

