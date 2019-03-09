
import java.util.*;
import java.lang.*;
import java.io.*;

class evenseries
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int a,b;
	Scanner s = new Scanner(System.in);
	a = s.nextInt();
	b = s.nextInt();
	for(int i=++a;i<b;i++)
	{
		if(i%2==0)
		{
			System.out.print(i + " ");
		}
	}
	}
}
