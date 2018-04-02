package com.company;

import java.io.File;
import java.io.IOException;

public class DirCreateFile {

    public static void main(String[] args) throws IOException {
        // write your code here
        File file;
        File dir = new File("D:\\javaweb\\");

        file = File.createTempFile("dir_file", ".txt", dir);
        System.out.println(file.getAbsolutePath());

        File file1 = new File("test");
        if (file1.createNewFile()) {
            //创建成功
            System.out.println("File created successful");
        }else {
            //文件已经存在
            System.out.println("File has existed");
        }

        File file2 = new File("test.txt");
        File file3 = new File("test.txt");
        System.out.println(file2.getName());
        System.out.println(file2.getAbsoluteFile());
        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.compareTo(file3));
        if (file2.compareTo(file3) == 0) {
            System.out.println("File path same");
        }else {
            System.out.println("File path not same");
        }
    }
}
