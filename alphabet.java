import java.io.*;
import java.util.*;
class alphabet
{
	public static void main(String args[])
	{
		char ch;
	Scanner s = new Scanner(System.in);
	ch = s.next().charAt(0);
	int n = (int)ch;
	if (n>64 && n<91)
	{
		System.out.println("Alphabet");
	}
	else if(n>96 && n<123)
	{
		System.out.println("Alphabet");
	}
	else
	{
		System.out.print("No");
	}
}
}
