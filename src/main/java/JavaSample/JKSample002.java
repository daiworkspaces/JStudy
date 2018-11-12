package JavaSample;

import java.util.Scanner;

public class JKSample002 {
    public static void main(String[] args)
    {
        System.out.println("请输入你的身份证号： ");
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();
        System.out.println("原来你的身份证号码是"+number.length()+"位数字啊");
    }
}
