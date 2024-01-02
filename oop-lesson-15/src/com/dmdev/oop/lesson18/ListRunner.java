package com.dmdev.oop.lesson18;

import com.dmdev.oop.lesson15.Archer;

public class ListRunner {

    public static void main(String[] args) {
        List<String> list = new List<>(10);
        list.add("String1");

        list.add("String4");
        list.add("String5");
        list.add("String6");
        list.add("String7");
        list.add("String8");
        list.add("String9");
        list.add("String10");
        //list.add("String11");

        String element = list.get(9);
        System.out.println(element);
    }
}