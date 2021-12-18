package com.ag.algorithms.solutions.datastructures;

import com.ag.algorithms.solutions.datastructures.tree.BinaryTree;
import com.ag.algorithms.solutions.datastructures.tree.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


class BinaryTreeTest {
    private BinaryTree intBinaryTree;

    @BeforeEach
    void setUp() {
        intBinaryTree = createTree();

    }

    @Test
    void insert() {

        int valueToInsert = 200;
        Assertions.assertThat(intBinaryTree.get(valueToInsert)).isNull();
        intBinaryTree.insert(valueToInsert);
        TreeNode expectedTreeNode = new TreeNode(valueToInsert);
        Assertions.assertThat(intBinaryTree.get(valueToInsert)).isEqualTo(expectedTreeNode);
    }

    @Test
    void get() {
        TreeNode expectedTreeNode = new TreeNode(26);
        Assertions.assertThat(intBinaryTree.get(26)).isEqualTo(expectedTreeNode);
    }

    @Test
    void get_not_found() {
        Assertions.assertThat(intBinaryTree.get(156)).isNull();
    }

    @Test
    void get_root() {
        TreeNode expectedTreeNode = new TreeNode(25);
        Assertions.assertThat(intBinaryTree.get(25)).isEqualTo(expectedTreeNode);
    }

    @Test
    void delete() {
        int valueToDelete = 30;
        TreeNode expectedTreeNode = new TreeNode(valueToDelete);
        Assertions.assertThat(intBinaryTree.get(valueToDelete)).isEqualTo(expectedTreeNode);
        intBinaryTree.delete(valueToDelete);
        Assertions.assertThat(intBinaryTree.get(valueToDelete)).isNull();

    }

    @Test
    void min() {
        Assertions.assertThat(intBinaryTree.min()).isEqualTo(15);
    }

    @Test
    void max() {
        Assertions.assertThat(intBinaryTree.max()).isEqualTo(32);
    }

    @Test
    void traverseInOrder() {
    }

    @Test
    void traversePreOrder() {
    }

    @Test
    void traversePostOrder() {
    }

    @Test
    void getRoot() {
        TreeNode expectedTreeNode = new TreeNode(25);
        Assertions.assertThat(intBinaryTree.get(25)).isEqualTo(expectedTreeNode);
    }


    private BinaryTree createTree() {
        BinaryTree intBinaryTree = new BinaryTree();
        intBinaryTree.insert(25);
        intBinaryTree.insert(20);
        intBinaryTree.insert(15);
        intBinaryTree.insert(27);
        intBinaryTree.insert(30);
        intBinaryTree.insert(29);
        intBinaryTree.insert(26);
        intBinaryTree.insert(22);
        intBinaryTree.insert(32);
        return intBinaryTree;
    }

    @Test
    void breadthFirstSearch() {

        Assertions.assertThat(intBinaryTree.breadthFirstSearch()).isEqualTo(Arrays.asList(25, 20, 27, 15, 22, 26, 30, 29, 32));

    }
}