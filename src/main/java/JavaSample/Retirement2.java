package JavaSample;

import java.util.Scanner;

public class Retirement2 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("How much money will you contribute every years?");
        double payment = in.nextDouble();

        System.out.println("Interest rate in %: ");
        double interstRate = in.nextDouble();

        double balance = 0;
        int year =0;
        String input ;

        do
            {

                balance += payment;
                double interest =balance * interstRate /100;
                balance += interest;

                year++;

                System.out.printf("After year %d, your balance is %,.2f%n ",year,balance);

                System.out.println("Ready to retire? (Y/N)");
                input = in.next();

            }
            while (input.equalsIgnoreCase("N"));

    }
}
