package io;

import com.sun.jdi.ClassNotLoadedException;
import jdbc.Employees;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MyObjectWriter {
    public static void main(String[] args) throws IOException, ClassNotLoadedException {
        Employees employees = new Employees(1, "Ion");

        OutputStream fileOutputStream = new FileOutputStream("D:\\testout.txt");


    }
}
