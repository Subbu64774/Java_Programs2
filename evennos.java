import java.util.Scanner;

/**
 * Created by Subramanian Ganesan on 6/9/2016.
 */
public class evennos {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the intervals");

        int a = sc.nextInt();
        int b= sc.nextInt();
        for (int i=a;i<=b;i++)
        {
            if (i%2==0)
                System.out.println(i);
        }
    }
}
