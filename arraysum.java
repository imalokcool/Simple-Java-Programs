import java.io.*;
import java.util.*;
class arraysum
{
	public static void main(String args[])
	{
		int n, k, sum=0;
		Scanner s = new Scanner( System.in);
		n = s.nextInt();
		k = s.nextInt();
		int arr[];
		arr  = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = s.nextInt();
		}
		for(int j=0;j<k;j++)
		{
			sum = sum + arr[j];
		}
		System.out.println(sum);
}
}
