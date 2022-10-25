package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:\\testout.txt");
        BufferedReader bufferedReader = Files.newBufferedReader(path);
        Path write = Files.write(path);
    }
}
