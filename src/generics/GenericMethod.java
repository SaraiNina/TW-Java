package generics;

import javax.lang.model.element.Name;

public class GenericMethod {
    private String name;

     public static <T> void name(T s){
         System.out.println(s);
     }

    public static void main(String[] args) {
        GenericMethod.name("Ana");
    }
}
