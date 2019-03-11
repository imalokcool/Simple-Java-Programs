import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) throws IOException
	{
	    Scanner s = new Scanner(System.in);
	    int n,big=0;
	    n = s.nextInt();
	    int[] arr = new int[n];
	    for(int i=1;i<n;i++)
	    {
	    	Scanner s1 = new Scanner(System.in);
	    	arr[i] = s.nextInt();
	    }
	    for(int i=1;i<=n;i++)
	    {
	    	if(arr[i]>big)
	    	{
	    		big = arr[i];
	    	}
	    	
	    }
	 System.out.println(big);   
	}
}
