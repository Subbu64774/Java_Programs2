import java.util.Scanner;

/**
 * Created by Subramanian Ganesan on 6/9/2016.
 */
public class checkprime {
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int count=0;
        for (int i=1;i<=a/2;i++)
        {
            if(a%i==0)
                count++;
        }
        if (count>1)
            System.out.println(a+" is not a prime number");
        else
            System.out.println(a+" is a prime number");
    }
}
