package com.dmdev.oop.lesson19.map;

import java.util.HashMap;
import java.util.Map;
import com.dmdev.oop.lesson19.person.Person;

public class MapExample {
    public static void main(String[] args) {

	Person ivan = new Person(1, "Ivan2", "Ivanov");
	Person petr = new Person(2, "Ivan", "Ivanov3");
	Person sveta = new Person(1, "Sveta", "Svetikova");
	
	Map<Integer, Person> map = new HashMap<Integer, Person>();
	map.put(ivan.getId(), ivan);
	map.put(petr.getId(), petr);
	map.putIfAbsent(sveta.getId(), sveta);

//      System.out.println(map.keySet());
//      System.out.println(map.values());
//      System.out.println(map.entrySet());
//
//      for (Person person : map.values()) {
//          System.out.println(person.getFirstName());
//      }
      for (Map.Entry<Integer, Person> entry : map.entrySet()) {
          System.out.println(entry.getKey() + "   " + entry.getValue());
      }
      System.out.println(map.containsKey(2));
      System.out.println(map.size());
      System.out.println(map.isEmpty());
      System.out.println(map.getOrDefault(2, sveta));
    }
    
}