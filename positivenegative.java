import java.io.*;
import java.util.*;
class positivenegative
{
  public static void main(String args[])
  {
    int a;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter number");
    a=sc.nextInt();
    if(a>0)
      {
      System.out.println("positive");
      }
    else if(a<0)
      {
      System.out.println("negative");
      }
     else if(a==0)
     {
      System.out.println("Zero");
     }
  }
}
