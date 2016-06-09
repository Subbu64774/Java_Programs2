import java.util.Scanner;

/**
 * Created by Subramanian Ganesan on 6/8/2016.
 */
public class Voweltest {
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            char c='s';
            System.out.println("enter the character");
            if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
                System.out.println("this is a vowel");
            else
                System.out.println("this is not a vowel");
    }
}
