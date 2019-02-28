package com.drafire.collection;

import com.drafire.collection.model.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestCollection {
    //ArrayList 是由数组组成
    private Collection<Person> arrayList = new ArrayList<>();
    //链表
    private Collection<Person> linkedList = new LinkedList<>();

    private static final int NUM = 1000000;

    @Test
    public void testAdd() {
        /**
         * 可以看出，如果是添加数据到集合里面，LinkedList比ArrayList更快；
         */
        arrayListAdd();
        linkedListAdd();
    }

    private void arrayListAdd() {
        long start = System.currentTimeMillis();
        System.out.println("arrayList，开始时间是：" + start);
        for (int i = 0; i < NUM; i++) {
            arrayList.add(new Person(i, i + ""));
        }
        long end = System.currentTimeMillis();
        System.out.println("arrayList，结束时间是：" + end);
        System.out.println("arrayList消耗时间：" + (end - start));
    }

    private void linkedListAdd() {
        long start = System.currentTimeMillis();
        System.out.println("linkedList，开始时间是：" + start);
        for (int i = 0; i < NUM; i++) {
            linkedList.add(new Person(i, i + ""));
        }
        long end = System.currentTimeMillis();
        System.out.println("linkedList，结束时间是：" + end);

        System.out.println("linkedList消耗时间：" + (end - start));
    }
}
