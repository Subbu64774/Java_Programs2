import java.util.Scanner;

/**
 * Created by Subramanian Ganesan on 6/9/2016.
 */
public class checkpoli {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int reverse=0,temp=a,remainder=0;
        for(;temp>0;)
        {
            remainder=temp%10;
            reverse=(reverse*10)+remainder;
            temp=temp/10;
        }
        if(a==reverse)
            System.out.println(a +"is a palindrome");
        else
            System.out.println(a +"is not a palindrome");



    }
}
