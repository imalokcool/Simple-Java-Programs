import java.io.*;
import java.util.*;
import java.math.*;
class power
{
	public static void main(String args[])
	{
		double a,b,sum=0;
		Scanner s = new Scanner( System.in);
		a = s.nextDouble();
		b = s.nextDouble();
		sum = Math.pow(a,b);
		System.out.println((int)sum);
}
}
