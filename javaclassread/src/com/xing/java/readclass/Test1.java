package com.xing.java.readclass;

/**
 * javap -v Test1.class > Test1.txt  查看当前class文件字节码文件
 */
public class Test1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int c = b - a;
        System.out.println(c);
    }
}
