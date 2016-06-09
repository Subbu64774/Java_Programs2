import java.util.Scanner;

/**
 * Created by Subramanian Ganesan on 6/9/2016.
 */
public class noofdigits {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int temp=a;
        int count=0;
        while(temp>0)
        {
            temp=temp/10;
            count++;
        }
        System.out.println(count);
    }
}
