package io;

import java.io.*;

public class MyFileReader {
    public static void main(String[] args) throws IOException {
      //  Reader reader = new FileReader("D:\\testout.txt");
        Writer writer = new FileWriter("D:\\testout.txt");
        writer.write("Acesta este un string nou");
        writer.flush();

    }
}
