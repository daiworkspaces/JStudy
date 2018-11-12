package JavaSample;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class JKSample004 {
    public static void main(String[] args)  {
        PrintStream out = System.out;
        PrintStream ps = null;
        try {
            ps = new PrintStream("./log.txt");
            System.out.println("开始程序的运行，还没有改变输出流");
            System.setOut(ps);
            int age=19;
            System.out.println("年龄变量成功定义，初始值为19");
            String sex ="女";
            System.out.println("性别变量定义成功，初始值为女");
            System.setOut(out);
            System.out.println("日志写入成功，查看log文件");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
