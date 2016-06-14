/**
 * Created by Subramanian Ganesan on 6/14/2016.
 */
public class multitable
{
    public static void main(String[] args){
        int i,k,j;

            for (k=1;k<=16;k++) {
                System.out.println();
                for (j = 1; j <= 16; j++)
                    System.out.println(k + "*" + j + "=" + k * j);
            }
    }
}
