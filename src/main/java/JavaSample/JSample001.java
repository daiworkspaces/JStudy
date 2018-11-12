package JavaSample;

import java.util.Scanner;

public class JSample001 {
    public static void main(String[] args)
    {
        System.out.println("请输入一个年份: ");
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();

        if(year % 4 == 0 && year % 100 !=0 || year % 400 ==0){
            System.out.println(year+" 是闰年！");

        }else
        {
            System.out.println(year+" 不是闰年！");
        }
    }
}
