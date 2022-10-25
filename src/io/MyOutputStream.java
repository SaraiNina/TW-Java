package io;

import java.io.*;


public class MyOutputStream {
    public static void main(String[] args) {
        File file= new File("D:\\testout.txt");
        if(file.exists()){
            System.out.println("Fisierul exista");
        }else{
            System.out.println("Fisierul nu exista");
        }
        try(OutputStream fout = new FileOutputStream(file)){
            fout.write("Wellcome".getBytes());
            System.out.println("succese");
        } catch (IOException e){
            e.printStackTrace();
        }

            }


}
