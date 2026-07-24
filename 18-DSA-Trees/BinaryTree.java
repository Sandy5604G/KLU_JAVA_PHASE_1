// ============================================
// Module: 18-DSA-Trees
// Program: BinaryTree
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Binary tree traversal
// ============================================
class Node {
    int data;
    Node left, right;
    Node(int data) { this.data = data; left = right = null; }
}

class Tree {
    Node root;
    
    void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }
    
    void preorder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }
    
    void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + " ");
        }
    }
}

public class BinaryTree {
    public static void main(String[] args) {
        Tree t = new Tree();
        t.root = new Node(1);
        t.root.left = new Node(2);
        t.root.right = new Node(3);
        t.root.left.left = new Node(4);
        t.root.left.right = new Node(5);
        
        System.out.print("Inorder: ");
        t.inorder(t.root);
        System.out.println();
        
        System.out.print("Preorder: ");
        t.preorder(t.root);
        System.out.println();
        
        System.out.print("Postorder: ");
        t.postorder(t.root);
        System.out.println();
    }
}
