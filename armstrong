import java.io.*;
import java.util.*;
import java.math.*;
class armstrong
{
    public static void main(String args[])throws IOException
    {
        int n,sum=0;
        Scanner s = new Scanner(System.in);
        n= s.nextInt();
        int m=n;
        int l=String.valueOf(n).length();
        while(n!=0)
        {
            int mod= n%10;
            double a = Math.pow(mod,l);
            sum = sum + (int)a;
            n=n/10;
        }
        if(sum==m)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
