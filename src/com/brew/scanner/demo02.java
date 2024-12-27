package com.brew.scanner;

import java.util.Scanner;

//一直输入
public class demo02 {
    public static void main(String[] args) {

//        创建新的系统输入流
        Scanner scanner = new Scanner(System.in);

        int num = 0;
        double sum = 0;

        System.out.println("请输入数字：");
        while (scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            num++;
            sum += x;
            System.out.println("输入的内容为："+ x + "总和为："+sum +"平均数为："+(sum/num));
        }
        System.out.println("输入了"+num+"个数字，总和为："+sum +"平均数为："+(sum/num));
        scanner.close();
    }
}
