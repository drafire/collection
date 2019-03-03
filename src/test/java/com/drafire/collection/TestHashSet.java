package com.drafire.collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashSet;
import java.util.Iterator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestHashSet {

    /**
     * hash 保证拥有相同的值的元素将会拥有相同的hashCode()，由于hashCode()的唯一性，所以相同的元素最多只能插入
     * hashSet 中一次
     */
    @Test
    public void testAdd(){
        HashSet<String> hashSet=new HashSet<String>(5,0.7f);
        for(int i=0;i<2;i++){
            hashSet.add(i+"");
        }
        System.out.println(hashSet.size());
        for(int i=2;i<4;i++){
            hashSet.add(i+"");
        }
        System.out.println(hashSet.size());
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next()+"->"+iterator.hashCode());
        }
    }
}
