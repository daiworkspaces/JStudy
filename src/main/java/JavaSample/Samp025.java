package JavaSample;

import java.math.BigDecimal;

public class Samp025 {

    public static void main(String[] args)
    {
        double money = 2;
        double price =1.1;
        double result =money-price;
        System.out.println("非精度计数结果："+result);

        //注意值 val  需要双引号扩起来。
        BigDecimal money1 = new BigDecimal("2");
        BigDecimal price1 = new BigDecimal("1.1");
        BigDecimal result1 = money1.subtract(price1);
        System.out.println("精度计数结果: "+result1);

    }
}
