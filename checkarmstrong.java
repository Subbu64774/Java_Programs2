import static com.sun.org.apache.xalan.internal.lib.ExsltMath.power;

/**
 * Created by Subramanian Ganesan on 6/14/2016.
 */
public class checkarmstrong {
    public static void main(String args[])
    {
        int no=325;
        int temp=no;int count=0;
        while(temp>0)
        {
            temp=temp/10;
            count++;

        }
        int digits=count;int sum=0;
        temp=no;
        while(temp>0)
        {
            temp=temp%10;
            sum= (int) (sum+(power(temp,digits)));
            temp=temp/10;
        }
        if (temp==no)
        System.out.println("is a armmstrong numbrtr");
        else
            System.out.println("is not a armstrong number");
    }
}
