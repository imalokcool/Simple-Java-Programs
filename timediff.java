
import java.util.*;
import java.lang.*;
import java.io.*;

class timediff
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int hr=0,min=0,hr1,min1,hr2,min2,time1=0,time2=0,diff=0;
		Scanner s = new Scanner (System.in);
		hr1 = s.nextInt();
		min1 = s.nextInt();
		hr2 = s.nextInt();
		min2 = s.nextInt();
		time1=hr1*60+min1;
		time2=hr2*60+min2;
		if(time1>time2)
		{
			diff=time1-time2;
		}
		else
		{
			diff=time2-time1;
		}
		hr=diff/60;
		min=diff%60;
		System.out.print(hr + " " +min);
	}
}
