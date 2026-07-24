// ============================================
// Module: 20-DSA-GraphsAdvanced
// Program: ShortestPath
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Shortest path
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
    
    void shortestPath(int start, int end) {
        boolean[] visited = new boolean[V];
        int[] parent = new int[V];
        Queue<Integer> q = new LinkedList<>();
        
        visited[start] = true;
        q.add(start);
        parent[start] = -1;
        
        while (!q.isEmpty()) {
            int v = q.poll();
            if (v == end) break;
            for (int n : adj[v]) {
                if (!visited[n]) {
                    visited[n] = true;
                    parent[n] = v;
                    q.add(n);
                }
            }
        }
        
        if (!visited[end]) {
            System.out.println("No path exists");
            return;
        }
        
        List<Integer> path = new ArrayList<>();
        for (int at = end; at != -1; at = parent[at]) path.add(at);
        Collections.reverse(path);
        
        System.out.print("Shortest Path: ");
        for (int p : path) System.out.print(p + " ");
        System.out.println();
    }
}

public class ShortestPath {
    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 5);
        
        g.shortestPath(0, 5);
    }
}
