package com.ll.exam;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class AppTest {
}

class HashMapTest {
    @Test
    void 클래스가_존재한다() {
        HashMap map = new HashMap();
    }
    @Test
    void 제너릭이_가능하다() {
        HashMap<String, Integer> map = new HashMap<>();
    }
    @Test
    void put() {
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("철수", 22);
    }
    @Test
    void get() {
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("철수", 22);
        int age = ages.get("철수");

        assertEquals(22, age);
    }
    @Test
    void _2nd_get() {
        HashMap<String, Integer> ages = new HashMap<>();
        ages.put("철수", 22);
        ages.put("영희", 25);
        assertEquals(22, ages.get("철수"));
        assertEquals(25, ages.get("영희"));
    }
}