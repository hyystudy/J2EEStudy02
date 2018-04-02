package com.company;

import java.io.*;

/**
 * 创建文件的规则是在 BufferWriter.java的package的父目录 也就是 com 文件夹的父目录（src 下面）
 */
public class BufferWriter {

    public static void main(String[] args) throws IOException {
	// write your code here


        File file = new File("test.txt");
        //file.mkdirs();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        bufferedWriter.write("I am test");

        bufferedWriter.close();

        System.out.println("File created successful!");

    }
}
