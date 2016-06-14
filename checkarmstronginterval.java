import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;

/**
 * Created by Subramanian Ganesan on 6/14/2016.
 */
public class checkarmstronginterval {
    public static void main(String args[]) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        for (int i = a; i <= b; i++) {

            int temp = a;
            int count = 0;
            while (temp > 0) {
                temp = temp / 10;
                count++;

            }
            int digits = count;
            int sum = 0;
            temp = a;
            while (temp > 0) {
                temp = temp % 10;
                sum = (int) (sum + (power(temp, digits)));
                temp = temp / 10;
            }
            if (sum == i)
                System.out.println(i + " is a armmstrong numbrtr");
           /* else
                System.out.println(i + " is not a armstrong number");*/
        }
    }
}
