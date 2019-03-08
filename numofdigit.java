import java.io.*;
import java.util.*;
class numofdigit
{
	public static void main(String args[])
	{
		int n,d,c=0;
		Scanner s = new Scanner( System.in);
		n = s.nextInt();
		while(n!=0)
		{
		     d = n%10;
			c++;
			n=n/10;
		}
		System.out.println(c);
}
}
