// ============================================
// Module: 19-DSA-Graphs
// Program: GraphBFS
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: BFS traversal
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
    
    void BFS(int start) {
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        visited[start] = true;
        q.add(start);
        
        while (!q.isEmpty()) {
            int v = q.poll();
            System.out.print(v + " ");
            for (int n : adj[v]) {
                if (!visited[n]) {
                    visited[n] = true;
                    q.add(n);
                }
            }
        }
    }
}

public class GraphBFS {
    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(2, 5);
        
        System.out.print("BFS: ");
        g.BFS(0);
        System.out.println();
    }
}
