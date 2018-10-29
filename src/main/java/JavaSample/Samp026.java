package JavaSample;

import java.util.Scanner;

public class Samp026 {
    public static void  main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个整数: ");
        long number = in.nextLong();
        System.out.println("你输入的数字是: "+number);
        System.out.println("该数字乘以2的运算结果为："+(number<<1));
        System.out.println("该数字乘以4的运算结果为："+(number<<2));
        System.out.println("该数字乘以8的运算结果为："+(number<<3));
        System.out.println("该数字乘以16的运算结果为："+(number<<4));
    }
}
