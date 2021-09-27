package com.ag.algorithms.solutions.tree;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TreeTest {
    private Tree intTree;

    @BeforeEach
    void setUp() {
        intTree = createTree();

    }

    @Test
    void insert() {

        int valueToInsert = 200;
        Assertions.assertThat(intTree.get(valueToInsert)).isNull();
        intTree.insert(valueToInsert);
        TreeNode expectedTreeNode = new TreeNode(valueToInsert);
        Assertions.assertThat(intTree.get(valueToInsert)).isEqualTo(expectedTreeNode);
    }

    @Test
    void get() {
        TreeNode expectedTreeNode = new TreeNode(26);
        Assertions.assertThat(intTree.get(26)).isEqualTo(expectedTreeNode);
    }

    @Test
    void get_not_found() {
        Assertions.assertThat(intTree.get(156)).isNull();
    }

    @Test
    void get_root() {
        TreeNode expectedTreeNode = new TreeNode(25);
        Assertions.assertThat(intTree.get(25)).isEqualTo(expectedTreeNode);
    }

    @Test
    void delete() {
        int valueToDelete = 30;
        TreeNode expectedTreeNode = new TreeNode(valueToDelete);
        Assertions.assertThat(intTree.get(valueToDelete)).isEqualTo(expectedTreeNode);
        intTree.delete(valueToDelete);
        Assertions.assertThat(intTree.get(valueToDelete)).isNull();

    }

    @Test
    void min() {
        Assertions.assertThat(intTree.min()).isEqualTo(15);
    }

    @Test
    void max() {
        Assertions.assertThat(intTree.max()).isEqualTo(32);
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
        Assertions.assertThat(intTree.get(25)).isEqualTo(expectedTreeNode);
    }


    private Tree createTree() {
        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);
        return intTree;
    }
}