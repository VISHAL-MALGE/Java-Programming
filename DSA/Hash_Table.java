
/*

 Hash Table :
  - A data structure that stores data in a key-value pair format.
  - It uses a hashing function to calculate an index for storing the key-value pair in an array,
  - ensuring fast data retrieval.
  - each key/value pair is known as entry
  - FAST insertion, look up, deletion of key/ value pairs
  - Not ideal for small data sets, great with large data sets


   - collision = hash function generates the same index for more than one key
                 less collisions = more efficiency
                 - If 2 key ids are same then its collision, it saved in that bucket linked list
                 - to avoid collision increase size of hash table


    Runtime complexity: Best Case O(1)
                        Worst Case O(n)

   - key.hashCode() % 10   used to see at which hash no. the entry are saved

*/



package DSA;

import java.util.Hashtable;

public class Hash_Table {

    public static void main(String[] args){

        //  key as Integer & value as String
        Hashtable<Integer, String> table = new Hashtable<>(10);

        table.put(100,"Steve");
        table.put(101,"Dustin");
        table.put(102,"Max");
        table.put(103,"Jane");
        table.put(104,"Will");

        System.out.println(table.get(103));  // To get specific value by key
        table.remove(101);   // To remove entry by key

        for (Integer key : table.keySet()){
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));
        }

        System.out.println();

            
        // Both key/value are Strings
        Hashtable<String, String> table2 = new Hashtable<>();

        table2.put("100","Steve");
        table2.put("101","Max");
        table2.put("102","Robin");
        table2.put("103","jane");


        for (String key : table2.keySet()){
            System.out.println(key.hashCode() % 11 + "\t" + key + "\t" + table2.get(key));
        }



    }
}
