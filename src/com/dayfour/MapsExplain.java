package com.dayfour;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapsExplain{
    public static void main(String args[])
    {
        // have to complete this code
        myHashMap();
        myTreeMap();
    }
    public static void myHashMap(){
        Map<Integer,String> map = new HashMap<Integer,String>();
        //Map<Integer,String> map = new LinkedHashMap<Integer,String>();

        map.put(101,"Delhi");
        map.put(102,"Pune");
        map.put(103,"Hyderabad");
        System.out.println(map);
        Set<?> set = map.entrySet();
        Iterator<?> itr = set.iterator();
        while(itr.hasNext()){
            Map.Entry entry = (Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        for(Map.Entry m: map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
   }
   public static void myTreeMap(){
        Map<Integer,String> map = new LinkedHashMap<Integer,String>();

        map.put(101,"pune");
        map.put(102,"chennai");
        map.put(103,"hyderabad");
        map.put(102,"jabalpur");
        Set<Integer> set = map.keySet();
        for(Integer key : set){
            System.out.println(key+" "+map.get(key));
        }
   }
}