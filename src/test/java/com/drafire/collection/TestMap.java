package com.drafire.collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMap {

    @Test
    public void add() {
        //Map<key,value> 里面定义的value 不能是primitive（原始）类型，因此不能使用int、boolean 这些
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "james");
        map.put(2, "lily");
        map.put(3, "tom");
        //Map不能对同一个key  put 两次value。事实上，第二次的put的value 将会覆盖掉第一次的value，并返回第一次的value
        String oldValue = map.put(1, "tony");

        System.out.println(map.get(1));
        System.out.println(oldValue);
        //get 将返回null
        System.out.println(map.get(5));
        //getOrDefault 如果为null，返回自定义的值
        System.out.println(map.getOrDefault(5, "empty"));

        //Map循环
        map.forEach((k, v) -> {
            System.out.println("{key=" + k + ",value=" + v + "}");
        });
    }

    @Test
    public void set(){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "james");
        map.put(2, "lily");
        map.put(3, "tom");

        //键集
        Set<Integer> integers = map.keySet();
        //键-值集
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> next = iterator.next();
            System.out.println(next.getValue());
        }
        //值集
        Collection<String> values = map.values();
    }

}
