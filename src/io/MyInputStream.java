package io;
import java.io.*;

public class MyInputStream {
    public static void main(String[] args) {
        InputStream fin = null;

try {
    File file = new File("D:\\\\testout.txt");
    fin = new FileInputStream(file);

            int i=0;
            while ((i = fin.read())!=-1){
                System.out.println((char) i);

            }
        }catch (Exception e){
            System.out.println(e);
        }finally{
            try{
                fin.close();

            }catch (IOException e ){
                e.printStackTrace();
            }
        }
    }
}
