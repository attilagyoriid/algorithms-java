package com.ag.algorithms.solutions.datastructures.tree;

import java.util.*;

/**
 * ::::: TREES :::::
 *
 * 		- Hierarchical data structure.
 * 		- Each field in the tree is called 'Node'.
 * 		- Each node can have a lot of children, but each child
 * 		can have one, and only one parent.
 * 		- The first node of the tree is called 'ROOT' and it doesn't
 * 		have a parent.
 * 		- Every tree can have one and only one root node.
 * 		- Trees are ideal when things contain things or when things
 * 		descend from other things.
 * 		- Java class hierarchy is an example of a tree.
 * 		- A node without children is called 'leaf node'.
 * 		- If a tree has only one node, is called a singleton tree, because
 * 		this tree has only the root node.
 * 		- Every node with descendants(children) is called Subtree.
 *
 * 		::::: BINARY SEARCH TREE :::::
 * 		- Every node has 0, 1 or 2 children, more than this isn't a binary tree.
 * 		- Children are referred to as the left child and right child.
 * 		- Binary search trees.
 * 		- Can perform insertions, deletions, and retrievals in O(logN) time.
 * 		- The left child always has a smaller value than its parent.
 * 		- The right child always has a larger value than its parent.
 * 		- This means, everything left to the root is less than the value of the root,
 * 		and everything right to the root is greater than the value of the root, because
 * 		of that, we can do a binary search.
 */
public class BinaryTree {


    private TreeNode root;

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }

    public TreeNode get(int value) {
        if (root != null) {
            return root.get(value);
        }
        return null;
    }

    public void delete(int value) {
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subTreeRoot, int value) {
        if (subTreeRoot == null) {
            return null; // Could return null, it's the same thing.
        }

        if (value < subTreeRoot.getData()) {
            subTreeRoot.setLeftChild(delete(subTreeRoot.getLeftChild(), value));
        } else if (value > subTreeRoot.getData()) {
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), value));
        } else {
            //Case 1 and 2: node to delete has zero or one child(ren)
            if (subTreeRoot.getLeftChild() == null) {
                return subTreeRoot.getRightChild();
            } else if (subTreeRoot.getRightChild() == null) {
                return subTreeRoot.getLeftChild();
            }

            //Case 3: node to delete has two children

            //Replace the value in the subTreeRoot node with the smallest
            //value from the right subTree
            subTreeRoot.setData(subTreeRoot.getRightChild().min());

            //Delete the node that has the smallest value in the right subtree
            subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), subTreeRoot.getData()));
        }
        return subTreeRoot;
    }

    public int min() {
        if (root == null) {
            return Integer.MIN_VALUE;
        } else {
            return root.min();
        }
    }

    public int max() {
        if (root == null) {
            return Integer.MAX_VALUE;
        } else {
            return root.max();
        }
    }

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }

    public void traversePreOrder() {
        if (root != null) {
            root.traversePreOrder();
        }
    }

    public void traversePostOrder() {
        if (root != null) {
            root.traversePostOrder();
        }
    }

    public TreeNode getRoot() {
        return root;
    }

    public List<Integer> breadthFirstSearch() {

        List<Integer> result = new ArrayList<>();

        Deque<TreeNode> queue = new LinkedList<>();


        queue.add(root);
        while (queue.size() > 0) {

            TreeNode currentNode = queue.pop();
            result.add(currentNode.getData());

            if (currentNode.getLeftChild() != null) {
                queue.add(currentNode.getLeftChild());
            }
            if (currentNode.getRightChild() != null) {
                queue.add(currentNode.getRightChild());
            }

        }
        return result;

    }




}
