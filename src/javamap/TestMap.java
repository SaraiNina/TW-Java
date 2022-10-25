package javamap;

import exception.DepartmentException;
import polimorfizm.Employee;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args){
        Map<Integer,String> myMap=new HashMap<>();
        myMap.put(1,"one");
        myMap.put(2,"Four");
        myMap.put(3,"Three");
        System.out.println(myMap);

    }



}
