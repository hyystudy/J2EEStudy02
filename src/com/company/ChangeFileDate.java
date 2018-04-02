package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class ChangeFileDate {

    public static void main(String[] args) throws IOException {

        File file = new File("test.txt");
        file.createNewFile();
        Date date = new Date(file.lastModified());
        System.out.println(date);

        System.out.println(file.setLastModified(System.currentTimeMillis()));

        Date date1 = new Date(file.lastModified());
        System.out.println(date1);
    }

}
