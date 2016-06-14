/**
 * Created by Subramanian Ganesan on 6/14/2016.
 */
public class PrintAscii
{
    public static void main(String[] args){
        for (int c=32; c<128; c++) {
            System.out.println(c + ": " + (char)c);
        }

    }}
