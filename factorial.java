import java.math.*;
import java.util.*;
class factorial
{

    public static void main(String[] args) 
    {

        int n, sum=1;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for(int i=1;i<=n;i++)
        {
        	sum  = sum * i;
        }
        System.out.println(sum);
    }
}
