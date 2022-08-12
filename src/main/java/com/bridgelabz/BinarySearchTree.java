
package com.bridgelabz;

    class Node {
        int data;
        Node left;
        Node right;
    }
    // All methods are nonstatic in the class so create object for this class in main method
    public class BinarySearchTree {
        //insert() method is used here to insert root and value
        public Node insert(Node root, int val) {
            if (root == null) {
                return createNewNode(val);
            }if (val < root.data) {
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
            print(root.right);
        }
        //Size method For checking all nodes are added or not
        public int size(Node node) {
            /*
             *  if condition is true then node is empty if condition is false then
             * else condition is worked
             */
            if (node == null)
                return 0;
            else
                return(size(node.left) + 1 + size(node.right));
        }
        //nodePresent method this is parameterized method.root and value are passed
        public boolean nodePresent(Node root, int val) {
            if (root == null) {
                return false;
            }
            Boolean isPresent = false;
            while (root != null) {
                if (val < root.data) {
                    root = root.left;
                } else if (val > root.data) {
                    root = root.right;
                } else {
                    isPresent = true;
                    break;
                }
            }
            return isPresent;
        }
    }

