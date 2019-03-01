package com.drafire.collection;

import com.drafire.collection.model.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestCollection {
    //ArrayList 是由数组组成
    private Collection<Person> arrayList = new LinkedList<>();
    //链表
    private Collection<Person> linkedList = new LinkedList<>();

    private static final int NUM = 1000000;


    @Test
    public void testAdd() {
        /**
         * 可以看出，如果是添加数据到集合里面，LinkedList比ArrayList 要慢，因为都是添加到集合的末位
         */
        arrayListAdd();
        linkedListAdd();

        /**
         * 循环的时候，LinkedList比ArrayList 要慢；
         */
        arrayListIterator();
        linkedListterator();
    }

    /**
     * 如果Collection 为null，调用isEmpty()将会抛出异常
     */
    @Test
    public void testIsEmpty(){
        System.out.println(arrayList.isEmpty());
        System.out.println(linkedList.isEmpty());
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

    private void arrayListIterator() {
        long start = System.currentTimeMillis();
        for (Person item : arrayList) {
        }
        long end = System.currentTimeMillis();
        System.out.println("arrayList循环消耗时间：" + (end - start));
    }

    private void linkedListterator() {
        long start = System.currentTimeMillis();
        linkedList.isEmpty();
        for (Person item : linkedList) {
        }
        long end = System.currentTimeMillis();
        System.out.println("linkedList循环消耗时间：" + (end - start));
    }

    /**
     * 集合是可以添加同一个对象的
     */
    @Test
    public void testIterator(){
        Person person1=new Person(1,"a");
        arrayList.add(person1);
        arrayList.add(person1);
        arrayList.add(new Person(1,"b"));

        Iterator<Person> iterator = arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
