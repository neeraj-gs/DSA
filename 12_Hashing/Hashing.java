/*
Hasing in JAva
    Technique where we convert one type of data to another
    We use a hash function and then convert it
        map and set are 2 data structures we create using hashing

    Helps reduce the time complexity
    Fast Execution -- Hsing in form of maps or sets

    Maps - 
    1.HashMap
    2.Lined HashMap
    3.TreeMap

    Sets
    1.HashSet
    2.LinkedHashSet
    3.TreeSet


    HashMap
        Used to store a table of information
        (key,value) pairs
        Each key is unique ][mian identifier]
        When there is cahgne in value we can do it in key value pairs

        Data table or nodes
    
        insert ,Remove and Search -- O(1)
        Eaxh key value is in form tabulation form

        Operations
        1.put(key,value)
            When we try to add an existing key , then it removes old value and updates the value


        


*/
import java.util.*;
public class Hashing{
    public static void main(String[] args) {
        // HashMap <key_type,Int_type> name = new HashMap<>(); //creation of  hashmaps
        HashMap<String,Integer> hm = new HashMap<>();

        //Insert
        hm.put("India",100);
        hm.put("US",50);

        System.out.println(hm); //we see it as object in type of key value pairs
        //order is stored randomly in HashMaps
        //O(1)

        //Get
        System.out.println(hm.get("US"));

        //COntains key - checks if key exits or not
        //get gives teh value , contains geive true or false if we hav ethat key or not
        System.out.println(hm.containsKey("India"));

        
    }
}