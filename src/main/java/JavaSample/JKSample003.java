package JavaSample;

import java.util.Scanner;

public class JKSample003 {

    public static void main(String[] args){
        System.out.println("请输入新员工的姓名：");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        System.out.println("请输入新员工应聘的编程语言：");
        String language =in.nextLine();
        switch (language.hashCode()){
            case 3254818:
            case 2301506:
            case 2269730:
                System.out.println("员工" +name +"被分配到Java程序开发部门。");
                break;

            case 3104:
            case 2112:
                System.out.println("员工" +name +"被分配到C#程序开发部门。");
                break;

            case -709190099:
            case 955463181:
            case 9745901:
                System.out.println("员工" +name +"被分配到ASP.NET程序开发部门。");
                break;
        }
    }
}
