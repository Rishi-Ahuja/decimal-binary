//program to convert decimal to binary

import java.util.*;

public class sca131
{
    public static void main(String[] args)
    {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter your input");
        long num = user.nextLong(), binary = 0, x= 0, count = 0;
        
        while (num != 0 )
        {
            x = num % 2;
            double y = Math.pow(10, count);
            num /= 2;
            binary += x * y;
            count++;
        }
        
        System.out.println(binary);
    }
}
