package com.ag.algorithms.solutions.datastructures.tree.list;

import com.ag.algorithms.domain.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeSinglyLinkedListTest {

    @Test
    void getMidPoint() {

        EmployeeSinglyLinkedList employeeSinglyLinkedList = new EmployeeSinglyLinkedList();
        employeeSinglyLinkedList.addToFront(new Employee("Attila", "Gyori", 1));
        employeeSinglyLinkedList.addToFront(new Employee("John", "Rambo", 2));
        employeeSinglyLinkedList.addToFront(new Employee("Peter", "Falk", 3));
        employeeSinglyLinkedList.addToFront(new Employee("Jesus", "Christ", 4));
        employeeSinglyLinkedList.addToFront(new Employee("James", "Bond", 6));
        employeeSinglyLinkedList.addToFront(new Employee("Hell", "Boy", 7));
        employeeSinglyLinkedList.addToFront(new Employee("Iron", "Man", 8));
        employeeSinglyLinkedList.addToFront(new Employee("God", "zilla", 9));

        System.out.println(employeeSinglyLinkedList.getMidPoint());
    }
}