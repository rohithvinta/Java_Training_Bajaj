package com.HashSetHashMap;

import java.util.HashMap;
import java.util.HashSet;

public class HashSetHashMap {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> set = new HashSet<>();
        
        // Adding elements to the HashSet
        set.add("apple");
        set.add("banana");
        set.add("cherry");
        set.add("banana"); // duplicate element, will not be added
        
        // Iterating through the HashSet
        for (String item : set) {
            System.out.println(item);
        }
        
        // Creating a HashMap
        HashMap<String, Integer> map = new HashMap<>();
        
        // Adding elements to the HashMap
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("cherry", 3);
        map.put("banana", 4); // duplicate key, value will be updated
        
        // Iterating through the HashMap
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}
