import java.io.*;
import java.util.*;
class sum
{
	public static void main(String args[])
	{
		int a, sum=0;
		Scanner s = new Scanner( System.in);
		a = s.nextInt();
		for(int i=1;i<=a;i++)
		{
			sum = sum + i;
		}
		System.out.println(sum);
}
}
