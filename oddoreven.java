/**
 * Created by Subramanian Ganesan on 6/8/2016.
 */

import java.util.Scanner;

public class oddoreven
{
    public static void main(String[] args) {
        int b ;
        Scanner sc= new Scanner(System.in);
        b=sc.nextInt();
        if (b % 2 == 0)
            System.out.println(b + "  is a even number");
        else
            System.out.println(b + "  is a odd number");
    }
}
