//convert into binary to decimal

//import java.util.Scanner;

public class sca138
{
    public static long conversion(long k)
    {
        long decimal = 0;
        int a = 0;
        String x = String.valueOf(k); //1111
        int len = x.length();//4
        for (int i = len - 1; i >=0; i--)
        {
            char y = x.charAt(a);
            int h = Integer.parseInt(String.valueOf(y));
            double ex = Math.pow(2, i);
            int e = (int)ex;
            decimal = decimal + h * e;
            a = a+1;
            
        }
        return decimal;
    }
    public static void main(String[] args)
    {
        sca000 input = new sca000();
        long k = input.longinput(), output = conversion(k);
        System.out.println(output);
    }
}