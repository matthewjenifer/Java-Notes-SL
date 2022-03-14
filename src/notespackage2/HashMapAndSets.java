package notespackage2;

import java.util.HashMap; // Arrays and Lists store elements as ordered collections, with each element given an integer index. HashMap is used for storing data collections as key and value pairs. One object is used as a key (index) to another object (the value). The put, remove, and get methods are used to add, delete, and access values in the HashMap.

import java.util.HashSet; // A Set is a collection that cannot contain duplicate elements. It models the mathematical set abstraction. One of the implementations of the Set is the HashSet class.

public class HashMapAndSets { // A HashMap cannot contain duplicate keys. Adding a new item with a key that already exists overwrites the old element. The HashMap class provides containsKey and containsValue methods that determine the presence of a specified key or value.  If you try to get a value that is not present in your map, it returns the value of null. null is a special type that represents the absence of a value. 
    public static void main(String[] args) {

        int a = 10;
        int b = 3;
        int c = 88;

        HashMap<String, Integer> happy = new HashMap<String, Integer>(); // Here is a HashMap with Strings as its keys and Integers as its values.
        happy.put("a", 10);
        happy.put("b", 3);
        happy.put("c", 88);

        System.out.println(happy); // prints: {a=10, b=3, c=88}
        System.out.println(happy.get("c")); // Use the get method and the corresponding key to access the HashMap elements. 
        System.out.println(happy.containsValue("c")); // prints: false
        System.out.println(happy.containsKey("c")); // prints: true
        happy.replace("c", 7); 
        System.out.println(happy); // prints: {a=10, b=3, c=7}
        
        HashSet<String> set = new HashSet<String>();
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set);
        System.out.println(set.size()); // You can use the size() method to get the number of elements in the HashSet.

        // LINKED-HASH-SET - The HashSet class does not automatically retain the order of the elements as they're added. To order the elements, use a LinkedHashSet, which maintains a linked list of the set's elements in order in which they were inserted.

        // What is hashing? - A hash table stores information through a mechanism called hashing, in which a key's informational content is used to determine a unique value called a hash code. So, basically, each element in the HashSet is associated with its unique hash code. 


    }
    
}
