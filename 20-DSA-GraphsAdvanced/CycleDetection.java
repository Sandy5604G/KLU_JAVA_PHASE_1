// ============================================
// Module: 20-DSA-GraphsAdvanced
// Program: CycleDetection
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Cycle detection
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
    
    boolean hasCycle() {
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i] && hasCycleUtil(i, visited, -1)) return true;
        }
        return false;
    }
    
    boolean hasCycleUtil(int v, boolean[] visited, int parent) {
        visited[v] = true;
        for (int n : adj[v]) {
            if (!visited[n]) {
                if (hasCycleUtil(n, visited, v)) return true;
            } else if (n != parent) return true;
        }
        return false;
    }
}

public class CycleDetection {
    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        
        System.out.println("Has Cycle: " + g.hasCycle());
        
        Graph g2 = new Graph(4);
        g2.addEdge(0, 1);
        g2.addEdge(1, 2);
        g2.addEdge(2, 0);
        System.out.println("Has Cycle: " + g2.hasCycle());
    }
}
