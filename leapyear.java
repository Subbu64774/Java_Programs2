import java.util.Scanner;

/**
 * Created by Subramanian Ganesan on 6/9/2016.
 */
public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");

        int year = sc.nextInt();
        if (year % 4 == 0) {
            System.out.println(year + "  is a leap year");

        }
        else
            System.out.println(year + "  is not a leap year");



    }
}
