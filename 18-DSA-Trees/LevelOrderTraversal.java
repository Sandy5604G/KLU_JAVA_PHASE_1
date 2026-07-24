// ============================================
// Module: 18-DSA-Trees
// Program: LevelOrderTraversal
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Level order traversal
// ============================================
import java.util.*;

class Node {
    int data;
    Node left, right;
    Node(int data) { this.data = data; left = right = null; }
}

class Tree {
    Node root;
    
    void levelOrder() {
        if (root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while (!q.isEmpty()) {
            Node node = q.poll();
            System.out.print(node.data + " ");
            if (node.left != null) q.add(node.left);
            if (node.right != null) q.add(node.right);
        }
    }
}

public class LevelOrderTraversal {
    public static void main(String[] args) {
        Tree t = new Tree();
        t.root = new Node(1);
        t.root.left = new Node(2);
        t.root.right = new Node(3);
        t.root.left.left = new Node(4);
        t.root.left.right = new Node(5);
        
        System.out.print("Level Order: ");
        t.levelOrder();
        System.out.println();
    }
}
