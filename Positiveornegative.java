import java.util.Scanner;

/**
 * Created by Subramanian Ganesan on 6/8/2016.
 */
public class Positiveornegative {
    public static void main(String[] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no to find positive or negative");
        n=sc.nextInt();
        if(n==0){
            System.out.println(n+" is a 0");
            exit();
        }
        if(n<0)
            System.out.println(n+" is a negative no");
        else
            System.out.println(n+" is a positive no");

    }
}
