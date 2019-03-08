import java.io.*;
import java.util.*;
import java.math.*;
class palindrome
{
	public static void main(String args[])
	{
		int a,b,d,n=0;
		Scanner s = new Scanner( System.in);
		a = s.nextInt();
		b=a;
		while(a!=0)
		{
			d = a%10;
			n = (n*10)+d;
			a=a/10;
		}
		if(n==b)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
}
}
