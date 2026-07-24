// ============================================
// Module: 20-DSA-GraphsAdvanced
// Program: Dijkstra
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Dijkstra's algorithm
// ============================================
import java.util.*;

public class Dijkstra {
    static final int INF = Integer.MAX_VALUE;
    
    static void dijkstra(int[][] graph, int src) {
        int V = graph.length;
        int[] dist = new int[V];
        boolean[] visited = new boolean[V];
        
        Arrays.fill(dist, INF);
        dist[src] = 0;
        
        for (int i = 0; i < V - 1; i++) {
            int u = minDistance(dist, visited);
            visited[u] = true;
            
            for (int v = 0; v < V; v++) {
                if (!visited[v] && graph[u][v] != 0 && 
                    dist[u] != INF && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }
        
        System.out.println("Vertex\tDistance from Source");
        for (int i = 0; i < V; i++) {
            System.out.println(i + "\t" + dist[i]);
        }
    }
    
    static int minDistance(int[] dist, boolean[] visited) {
        int min = INF, minIdx = -1;
        for (int i = 0; i < dist.length; i++) {
            if (!visited[i] && dist[i] < min) {
                min = dist[i];
                minIdx = i;
            }
        }
        return minIdx;
    }
    
    public static void main(String[] args) {
        int[][] graph = {
            {0, 4, 0, 0, 0, 0},
            {4, 0, 8, 0, 0, 0},
            {0, 8, 0, 7, 0, 4},
            {0, 0, 7, 0, 9, 14},
            {0, 0, 0, 9, 0, 10},
            {0, 0, 4, 14, 10, 0}
        };
        
        dijkstra(graph, 0);
    }
}
