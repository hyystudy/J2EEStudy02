package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));
        String string;
        while ( (string = bufferedReader.readLine())!= null){
            System.out.println(string);
        }

        bufferedReader.close();
    }
}
