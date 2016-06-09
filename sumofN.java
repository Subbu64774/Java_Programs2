/**
 * Created by Subramanian Ganesan on 6/9/2016.
 */
public class sumofN {
    public static void main(String[] args){
        int sum=0;
        Sacnner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for (int i=0;i<=N;i++) {
            sum+=i;

        }
        System.out.println(sum);
    }
}
