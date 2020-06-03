package com.amazon.beauty;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class BeautyDepartment {

    public static void treeMapDemo(){

        TreeMap <Integer,String> beautyMap = new TreeMap<Integer, String>();
        beautyMap.put(1,"Siva");
        beautyMap.put(5,"Ram");
        beautyMap.put(2,"Kavitha");
        beautyMap.put(4,"Emanuel");
        beautyMap.put(3,"Raj");
        beautyMap.put(0,"Test");

        for(Map.Entry m : beautyMap.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }

    public static void main(String[] args) {
        //BeautyDepartment bd = new BeautyDepartment();
        BeautyDepartment.treeMapDemo();
    }
}
