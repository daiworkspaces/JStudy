package JavaSample;



public class JKSample001 {

    public static void main(String[] args){
        int day =365;
        int sum=0;
        for (int i =2000 ;i<2016;i++)
        {
            if (i % 4 ==0 && i % 100 !=0 || i % 400 ==0){


                sum =day+1+sum;
            }
            else {
                sum =day+sum;
            }
        }



    }
}
