package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TempFile {

    public static void main(String[] args) throws IOException {
        // write your code here
        File tempFile = File.createTempFile("temp", "txt");

        System.out.println(tempFile.getAbsolutePath());

        tempFile.deleteOnExit();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(tempFile));

        bufferedWriter.write("temp file");

        System.out.println("Temp File created");

        bufferedWriter.close();
    }
}
