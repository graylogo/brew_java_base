package com.brew.struct;

import java.util.Scanner;

// 流程控制 顺序、判断、循环
public class demo01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入分数：");
        if (scanner.hasNextFloat()) {
            float score = scanner.nextFloat();

//            明显不适用
            switch ((int) score) {
                case 100:
                    System.out.println("恭喜满分！");
                    break;
                case 90:
                    System.out.println("A级");
                    break;
                case 80:
                    System.out.println("B级");
                    break;
                case 70:
                    System.out.println("C级");
                    break;
            }

                if (score == 100) {
                    System.out.println("恭喜满分！");
                } else if (score < 100 && score >= 90) {
                    System.out.println("A级");
                } else if (score < 90 && score >= 80) {
                    System.out.println("B级");
                } else if (score < 80 && score >= 70) {
                    System.out.println("C级");
                } else if (score < 70 && score >= 60) {
                    System.out.println("D级");
                } else if (score < 60 && score >= 0) {
                    System.out.println("不及格");
                }

            }
        }
    }

