package JavaSample;

import java.util.Scanner;

public class LotteryOdds {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        //需要提取多少个数字
        System.out.print("How many numbers do you need to draw?");
        int k = in.nextInt();


        //最高可以提取的数字
        System.out.print("what is the highest number you can draw?");
        int n = in.nextInt();

        //中奖概率
        int lotteryOdds =1;
        for(int i =1;i <=k; i++)

            lotteryOdds =lotteryOdds*(n-i+1)/i;

        System.out.println("Your odds are 1 in " + lotteryOdds +". Good luck!");

    }
}
