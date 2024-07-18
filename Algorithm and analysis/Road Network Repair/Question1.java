//Nhlapo Nkululeko Villicent - 4129962

/*This code first defines the edges and their costs, sorts the edges in ascending order of cost, and then applies Kruskal's 
algorithm to find the minimum cost and selected edges. Finally, it divides the selected edges into sections and prints the 
results. */

import java.util.*;

// Class to represent an edge in the graph
class Edge implements Comparable<Edge> {
    int u, v, cost;

    public Edge(int u, int v, int cost) {
        this.u = u;
        this.v = v;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge other) {
        return this.cost - other.cost;
    }
}
// Class for Disjoint-Set data structure used in Kruskal's algorithm
class DisjointSet {
    int[] parent;

    public DisjointSet(int n) {
        parent = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;// Initialize each element as its own parent
        }
    }

    // Find operation with path compression
    int find(int node) {
        if (parent[node] != node) {
            parent[node] = find(parent[node]);
        }
        return parent[node];
    }
// Union operation to merge two sets
    void union(int u, int v) {
        int rootU = find(u);
        int rootV = find(v);
        parent[rootU] = rootV;
    }
}

public class Question1 {
    // Kruskal's algorithm to find the minimum spanning tree
    public static List<Edge> kruskalsMinCost(List<Edge> edges, int n) {
        Collections.sort(edges); // Sort the edges by cost
        List<Edge> mst = new ArrayList<>();
        DisjointSet disjointSet = new DisjointSet(n);
        int totalCost = 0;

        for (Edge edge : edges) {
            int u = edge.u;
            int v = edge.v;
            int cost = edge.cost;

            if (disjointSet.find(u) != disjointSet.find(v)) {
                mst.add(edge); // Add the edge to the MST
                disjointSet.union(u, v);
                totalCost += cost;
                if (mst.size() == n - 1) {
                    break;
                }
            }
        }

        return mst;
    }

    public static void main(String[] args) {
        String[] cities = {"B", "M", "S", "Q", "C", "L", "K", "H", "P", "D", "N", "W", "T", "Y", "J", "I", "E", "U", "F", "X", "G", "R"};
        // Define the edges connecting the cities along with their maintenance costs
        List<Edge> edges = new ArrayList<>(Arrays.asList(
            new Edge(0, 1, 7), new Edge(0, 2, 13), new Edge(2, 6, 35),
            new Edge(1, 3, 16), new Edge(2, 3, 9), new Edge(3, 4, 19),
            new Edge(4, 5, 25), new Edge(4, 9, 22), new Edge(6, 7, 7),
            new Edge(9, 7, 18), new Edge(7, 10, 14), new Edge(6, 10, 32),
            new Edge(13, 12, 76), new Edge(12, 11, 44), new Edge(11, 14, 11),
            new Edge(14, 15, 20), new Edge(15, 18, 3), new Edge(18, 19, 30),
            new Edge(19, 20, 4), new Edge(20, 21, 12)
        ));

        int n = cities.length;
        // Find the minimum spanning tree using Kruskal's algorithm
        List<Edge> mst = kruskalsMinCost(edges, n);
        // Print the results
        System.out.println("Number of sections: 1");
        System.out.println("Edge list:");
        for (Edge edge : mst) {
            System.out.println(edge.u + " - " + edge.v);
        }
    }
}















