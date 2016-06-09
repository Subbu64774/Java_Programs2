import java.util.Scanner;

/**
 * Created by Subramanian Ganesan on 6/9/2016.
 */
public class greatestfromthree {
    public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    if((a>b)&&(a>c))
    {
        System.out.println(a +" is the big");
    }
        else if((b>a)&&(b>c))
        System.out.println(b +" is the big");
        else
        System.out.println(c +" is the big");


    }
}
