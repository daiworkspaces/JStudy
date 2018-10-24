package JavaSample;

import java.util.Scanner;

public class Samp024 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入一个整数： ");
        long number = in.nextLong();
        String check = (number % 2==0)? "这个数字是偶数":"这个数字是奇数";
        System.out.println(check);
    }
}
