// ============================================
// Module: 20-DSA-GraphsAdvanced
// Program: ConnectedComponents
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Connected components
// ============================================
import java.util.*;

class Graph {
    private int V;
    private LinkedList<Integer>[] adj;
    
    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) adj[i] = new LinkedList<>();
    }
    
    void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
    }
    
    void DFS(int v, boolean[] visited) {
        visited[v] = true;
        for (int n : adj[v]) {
            if (!visited[n]) DFS(n, visited);
        }
    }
    
    int countComponents() {
        boolean[] visited = new boolean[V];
        int count = 0;
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                DFS(i, visited);
                count++;
            }
        }
        return count;
    }
}

public class ConnectedComponents {
    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(3, 4);
        
        System.out.println("Connected Components: " + g.countComponents());
    }
}
