// ============================================
// Module: 18-DSA-Trees
// Program: BST
// Author: Sandeep Abhilash
// Email: sandeepabhilash696@gmail.com
// Date: 24-07-2026
// Purpose: Binary Search Tree
// ============================================
class BSTNode {
    int data;
    BSTNode left, right;
    BSTNode(int data) { this.data = data; left = right = null; }
}

class BST {
    BSTNode root;
    
    void insert(int data) {
        root = insertRec(root, data);
    }
    
    BSTNode insertRec(BSTNode root, int data) {
        if (root == null) return new BSTNode(data);
        if (data < root.data) root.left = insertRec(root.left, data);
        else if (data > root.data) root.right = insertRec(root.right, data);
        return root;
    }
    
    void inorder() {
        inorderRec(root);
        System.out.println();
    }
    
    void inorderRec(BSTNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
}

public class BST {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);
        
        System.out.print("BST Inorder: ");
        bst.inorder();
    }
}
