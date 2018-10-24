package JavaSample;

import java.util.Scanner;

public class Samp023 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("输入一个英文字符串或解密字符串");
        String passwd = in.nextLine();

        char[] array = passwd.toCharArray();

        for(int i =0; i<array.length;i++)
        {
            array[i]= (char) (array[i]^20000);
        }
        System.out.println("加密或解密的字符串如下：");
        System.out.println(new String(array));
    }
}
