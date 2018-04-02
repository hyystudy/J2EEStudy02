package com.company;

import java.io.File;

public class RenameFile {

    public static void main(String[] args) {
        File file = new File("hyy.txt");
        File file1 = new File("zal.txt");
        System.out.println(file.setReadOnly());
        System.out.println(file.canWrite());
        System.out.println(file1.exists());
        if (file.renameTo(file1)){
            System.out.println("Rename file successful");
        }else {
            System.out.println("Rename file failed");
        }
    }
}
