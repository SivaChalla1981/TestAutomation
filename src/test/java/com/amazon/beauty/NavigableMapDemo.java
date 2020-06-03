package com.amazon.beauty;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {

    public static void navigableMapDemo(){

        NavigableMap<Integer, String> navMap = new TreeMap<Integer, String>();
        navMap.put(1,"Amazon");
        navMap.put(3,"GroupOn");
        navMap.put(2,"EBay");
        navMap.put(4,"TataCliq");

        System.out.println("Decending Order" + navMap.descendingMap());
         System.out.println("Head Map " + navMap.headMap(3));
         System.out.println("Tail Map " + navMap.tailMap(3));
         System.out.println("Elements that got permission to display " + navMap.subMap(1,false,4,true));

    }

    public static void main(String[] args) {
        NavigableMapDemo.navigableMapDemo();
    }
}
