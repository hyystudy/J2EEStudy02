package com.company;

import java.io.File;

public class GetFileSize {

    public static void main(String[] args) {
        // write your code here
        long fileSize = getFileSize("test.txt");
        System.out.println("File size is :" + fileSize);
    }

    public static long getFileSize(String fileName){
        File file = new File(fileName);
        if (!file.exists() || file.isDirectory()) {
            System.out.println("File not exists");
            return -1;
        }
        return file.length();
    }

}
