/*
Ability to create a Binary Tree
 */

package com.bridgelabz;

public class BinarySearchTreeMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Binary Search Tree Program");

        BinarySearchTree bst = new BinarySearchTree();
        Node root = null;
        // inserting the value in root
        root = bst.insert(root, 56); // 56 is adding in root
        root = bst.insert(root, 30);
        root = bst.insert(root, 70);
        root = bst.insert(root, 22);
        root = bst.insert(root, 40);
        root = bst.insert(root, 60);
        root = bst.insert(root, 95);
        root = bst.insert(root, 11);
        root = bst.insert(root, 65);
        root = bst.insert(root, 3);
        root = bst.insert(root, 6);
        root = bst.insert(root, 63);
        root = bst.insert(root, 67);

        bst.print(root);

    }
}
