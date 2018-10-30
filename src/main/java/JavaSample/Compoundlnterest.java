package JavaSample;

public class Compoundlnterest {

    public static void main(String[] args){

        //开始利率
        final double STARTRATE =10;
        //N种利率
        final int NRATES =6;
        //N 年
        final int NYEARS =10;


        //设置利率10--15%
        //set interest rates to 10...15%
        double[] interestRate = new double[NRATES];
        for (int j =0; j<interestRate.length;j++)
        {
            interestRate[j] =(STARTRATE+j)/100.0;
            //System.out.println(interestRate[j]);
        }

        //创建一个数组保存余额
        double[][] balances = new double[NYEARS][NRATES];

        //设置起始金额
        //set initial balances to 10000
        for (int j =0;j<balances[0].length;j++)
        {
            balances[0][j]=10000;
        }

        //compute interest for future years
        for (int i=1;i<balances.length;i++){

            for (int j =0;j<balances[i].length;j++){

                //获得去年前一行的余额
               //get last years's balances from previous row
                double oldBalance =balances[i-1][j];



                //计数利息
                //compute interest
                double interest = oldBalance * interestRate[j];

                //计数这年的余额
                //compute this year's balance

                balances[i][j]=oldBalance+interest;


            }

        }

        for (int j =0;j < interestRate.length;j++)
            System.out.printf("%9.0 ∂f%%",100*interestRate[j]);

        System.out.println();

        for (double[] row :balances){
            for (double b : row)
                System.out.printf("%10.2f",b);
            System.out.println();
        }



    }
}
