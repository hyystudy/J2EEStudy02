package com.company;

import java.io.*;

public class CopyDemo {

    public static void main(String[] args) throws IOException {
        //创建源文件
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src_file.txt"));
        bufferedWriter.write("I Love Java Language");
        bufferedWriter.close();

        //获取源文件的fileInputStream
        FileInputStream fileInputStream = new FileInputStream("src_file.txt");
        // 创建目标文件的输出流 把文件输出流指向D盘javaweb 下面的des_file.txt
        FileOutputStream fileOutputStream = new FileOutputStream("des_file.txt");

        byte[] buf = new byte[1024];

        int len;
        //fileInputStream.read(buf) 相当于把 读取到的内容赋值给了 buf；
        while ((len = fileInputStream.read(buf)) > 0){
            fileOutputStream.write(buf, 0, len);
        }

        fileInputStream.close();
        fileOutputStream.close();

        //在控制台上显示 目标文件的内容

        BufferedReader bufferedReader = new BufferedReader(new FileReader("des_file.txt"));
        String string;
        while ((string = bufferedReader.readLine()) != null) {
            System.out.println(string);
        }

        bufferedReader.close();


    }
}
