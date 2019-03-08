import java.io.*;
class evenodd
{
  public static void main (String args[])
  Scanner s = new Scanner(System.in);
  int n = s.nextInt();
  if(n%2==0)
  {
    System.out.println("Even");
   }
   else if(n%2!=0)
   {
    System.out.println("Odd");
   }
   else
   {
    System.out.print("Invalid");
   }
