import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) throws IOException
	{
	    Scanner s = new Scanner(System.in);
	    int n,a,d,sum=0;
	    n = s.nextInt();
	    a = s.nextInt();
	    d = s.nextInt();
	    for(int i=1;i<=n;i++)
	    {
	    	int ap=0;
	    	ap = a + (i-1)*d;
	    	
	    	sum = sum + ap;  
	    }
	 System.out.println(sum);   
	}
}
