/*
Ability to search 63 in the Binary Tree
 */

package com.bridgelabz;

public class BinarySearchTreeMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Binary Search Tree Program");

        BinarySearchTree bst = new BinarySearchTree();
        Node root = null;
        // Inserting the value in root
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
        // If condition is true then First print the output is boolean type because this is boolean method
        System.out.println(bst.nodePresent(root, 63));
        /*
         * if else statement is used if condition is true then print Element 63 is present in binary tree
         * if condition false then print Element 63 is not present in binary tree.
         */
        if(root != null)
            System.out.println("\nElement 63 is present in the Binary tree");
        else
            System.out.println("\nElement 63 is not present in the Binary tree");

    }
}
