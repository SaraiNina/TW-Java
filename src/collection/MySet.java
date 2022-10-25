package collection;

import java.util.*;

public class MySet {
    public static void main(String[] args){

    Set<String> arrayList =new TreeSet<>();
        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");
        arrayList.add("Three");
        arrayList.add("1");
       Set <String> mySet= new TreeSet<>(arrayList);
        System.out.println(mySet);


//hashset
        // Set<String> mySet =new HashSet<>();
        //  mySet.add("One");
        //  mySet.add("Two");
        //  mySet.add("Three");
        // Set <String> mySet2= new HashSet<>();
        //  mySet2.add("One");
        //   mySet2.retainAll(mySet2);
        //   System.out.println(mySet);
   }
}
