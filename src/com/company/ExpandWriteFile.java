package com.company;

import java.io.*;

public class ExpandWriteFile {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedWriter writer = new BufferedWriter(new FileWriter("hyy.txt"));

        writer.write("贺洋洋\n");
        writer.close();

        //fileWriter 的第二个参数代表是否写的内容追加, 如果为true 表示追加 false 表示覆盖;
        writer = new BufferedWriter(new FileWriter("hyy.txt", true));

        writer.write("周爱丽\n");
        writer.close();


        BufferedReader bufferedReader = new BufferedReader(new FileReader("hyy.txt"));

        String s;
        while ((s = bufferedReader.readLine()) != null) {
            System.out.println(s);
        }

        bufferedReader.close();
    }

}
