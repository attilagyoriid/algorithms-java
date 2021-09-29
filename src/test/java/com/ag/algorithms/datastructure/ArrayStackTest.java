package com.ag.algorithms.datastructure;

import com.ag.algorithms.domain.Employee;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

class ArrayStackTest {

    private ArrayStack arrayStack;

    @BeforeEach
    void setUp() {
        arrayStack = new ArrayStack(5);
        arrayStack.push(new Employee("Attila", "Gyori",1));
        arrayStack.push(new Employee("John", "Rambo",3));
        arrayStack.push(new Employee("Mickey", "Mouse",5));
        arrayStack.push(new Employee("Iron", "Man",6));
        arrayStack.push(new Employee("One", "Two",7));
    }

    @Test
    void push() {
        Employee employee = new Employee("Push", "Works", 1);
        arrayStack.push(employee);
        Assertions.assertThat(arrayStack.size()).isEqualTo(6);
        Assertions.assertThat(arrayStack.peek()).isEqualTo(employee);
    }

    @Test
    void pop() {
        Employee employee = new Employee("Push", "Works", 1);
        arrayStack.push(employee);
        Assertions.assertThat(arrayStack.pop()).isEqualTo(employee);
        Assertions.assertThat(arrayStack.size()).isEqualTo(5);
    }

    @Test
    void peek() {
        Employee employee = new Employee("Push", "Works", 1);
        arrayStack.push(employee);
        Assertions.assertThat(arrayStack.size()).isEqualTo(6);
        Assertions.assertThat(arrayStack.peek()).isEqualTo(employee);
    }

    @Test
    void size() {
        Employee employee = new Employee("Push", "Works", 1);
        arrayStack.push(employee);
        Assertions.assertThat(arrayStack.pop()).isEqualTo(employee);
        Assertions.assertThat(arrayStack.size()).isEqualTo(5);
    }

    @Test
    void isEmpty() {
        IntStream.range(0,arrayStack.size()).forEach(i->arrayStack.pop());
        Assertions.assertThat(arrayStack.isEmpty()).isTrue();
    }
}