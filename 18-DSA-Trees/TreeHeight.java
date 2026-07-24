// ============================================
// Module: 18-DSA-Trees
// Program: TreeHeight
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Tree height
// ============================================
class Node {
    int data;
    Node left, right;
    Node(int data) { this.data = data; left = right = null; }
}

class Tree {
    Node root;
    
    int height(Node node) {
        if (node == null) return 0;
        return 1 + Math.max(height(node.left), height(node.right));
    }
}

public class TreeHeight {
    public static void main(String[] args) {
        Tree t = new Tree();
        t.root = new Node(1);
        t.root.left = new Node(2);
        t.root.right = new Node(3);
        t.root.left.left = new Node(4);
        
        System.out.println("Tree Height: " + t.height(t.root));
    }
}
