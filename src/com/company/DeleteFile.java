package com.company;

import java.io.File;

public class DeleteFile {

    public static void main(String[] args){


        File file = new File("D:\\javaweb\\hyy");//删除的是文件夹
        File file2 = new File("D:\\javaweb\\Main.class");//删除的是文件 目录是D盘下javaweb文件夹下的Main.class文件
        if (file2.delete()) {
            System.out.println(file2.getName() + "   deleted successful");
        }else {
            System.out.println("Delete file failed");
        }
    }
}
