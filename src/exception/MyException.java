package exception;

import java.io.FileNotFoundException;

public class MyException {
    public static void main(String[] args) throws FileNotFoundException {
        //    int arr[]=null;

        //    try{
        //      arr=new int[3];
        //       System.out.println(arr[3]);
        //        System.out.println("dupa scoaterea elementului 3");

        //    }
        //    catch(Throwable throwable) {
        //      if (arr.length < 4) {
        //        arr = new int[4];
        //      System.out.println(arr[3]);

        //   }
        //     System.out.println("In catch");
        // }
        //  finally{
        //      System.out.println("Finally");
        //   }
        CustomClass customClass =new CustomClass();
        customClass.m(9);
        }

    }


