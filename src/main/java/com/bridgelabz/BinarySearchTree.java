
package com.bridgelabz;

    class Node {
        int data;
        Node left;
        Node right;

    }
    // All methods are nonstatic in the class so create object for this class in main method
    public class BinarySearchTree {
        //insert method is used here to insert root and value
        public Node insert(Node root, int val) {

            if (root == null) {
                return createNewNode(val);
            }
            if (val < root.data) {
                root.left = insert(root.left, val);

            } else if (val > root.data) {
                root.right = insert(root.right, val);
            }
            return root;
        }
        public Node createNewNode(int k) {//Create method createNewNode
            Node bst = new Node();
            bst.data = k;
            bst.left = null;
            bst.right = null;
            return bst;
        }

        public void print(Node root) {//Here print method is created to print the data
            if (root == null) {
                return;
            }
            print(root.left);
            System.out.print(root.data +"->");
            //null right side
            print(root.right);
        }
    }

