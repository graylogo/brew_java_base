package com.brew.scanner;

import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入数据：");

        if(scanner.hasNextLine()){
            String str = scanner.nextLine();
            System.out.println("输入的内容为："+str);
        }
        scanner.close();
    }
}
