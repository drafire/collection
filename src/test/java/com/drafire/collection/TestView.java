package com.drafire.collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestView {

    @Test
    public void testAdd(){
        List<String> names= Arrays.asList("a","b");
        List<String> aDefault = Collections.nCopies(3, "default");
        Iterator<String> iterator = aDefault.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    @Test
    public void testBinarySearch(){
        List<Integer> list=Arrays.asList(3,1,40,2,8,343,2,19,30,2,3);

    }
}
