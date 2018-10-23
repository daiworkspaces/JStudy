package JavaSample;

import java.util.Scanner;

public class Retirement {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        //退休需要多少钱？
        System.out.println("How much money do you need to retire?");
        double goal = in.nextDouble();

        //每年存多少钱
        System.out.println("How much money do contribute every year?");
        double payment = in.nextDouble();


        //利率
        System.out.println("Interest rate in %: " );
        double interestRate = in.nextDouble();

        //余额
        double balance =0;
        int years =0;

        while (balance<goal){

            balance  +=payment;
            double  interset = balance * interestRate /100;
            balance += interset;
            years++;

        }

        System.out.println("You can retire in " +years+" years.");

    }
}
