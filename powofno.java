import java.util.Scanner;

/**
 * Created by Subramanian Ganesan on 6/9/2016.
 */
public class powofno {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int pow=sc.nextInt();
        System.out.println(a^pow);
       /* int power=1;
        for(int i=pow;i<0;i--)
            power=power*a;
        System.out.println(power);*/
    }

}
