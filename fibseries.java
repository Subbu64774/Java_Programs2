/**
 * Created by Subramanian Ganesan on 6/14/2016.
 */
public class fibseries {
    public static void main(String[] java)
    {
        int a=0,b=1,sum=0;
        for (int i=1;i<=10;i++)
        {
            sum=a+b;
            a=b;
            b=sum;
            System.out.println(sum);
        }
    }
}
