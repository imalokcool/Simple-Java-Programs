
import java.util.*;
import java.lang.*;
import java.io.*;

class arraylist
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			
			arr[i] = s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		System.out.println(arr[i] + " " + i);
		}
	}
}
