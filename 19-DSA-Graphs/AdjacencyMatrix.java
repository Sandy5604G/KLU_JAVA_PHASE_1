// ============================================
// Module: 19-DSA-Graphs
// Program: AdjacencyMatrix
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Adjacency matrix
// ============================================
import java.util.*;

public class AdjacencyMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter vertices: ");
        int V = scanner.nextInt();
        System.out.print("Enter edges: ");
        int E = scanner.nextInt();
        
        int[][] graph = new int[V][V];
        
        System.out.println("Enter edges (u v):");
        for (int i = 0; i < E; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            graph[u][v] = 1;
            graph[v][u] = 1;
        }
        
        System.out.println("\nAdjacency Matrix:");
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
