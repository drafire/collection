package com.drafire.collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDeque {

    @Test
    public void addArrayDeque() {
        System.out.println("下面是由ArrayDeque实现的Deque");
        Deque<String> stringDeque = new ArrayDeque<>(3);
        stringDeque.add("1");
        stringDeque.add("2");
        stringDeque.add("2");
        stringDeque.add("3");
        stringDeque.offer("4");

        for (String item : stringDeque) {
            System.out.print(item + "|");
        }
        System.out.println();
    }

    @Test
    public void addLinkedListQueue() {
        System.out.println("下面是由LinkedList实现的Deque");
        Deque<String> stringDeque = new LinkedList<>();
        stringDeque.add("1");
        stringDeque.add("2");
        stringDeque.add("2");
        stringDeque.add("3");
        stringDeque.offer("4");

        for (String item : stringDeque) {
            System.out.print(item + "|");
        }
        System.out.println();
    }
}
