import java.util.Scanner;
class primerange
{
    public static void main(String args[])
    {
        int start, end, i, j, count=0;

        Scanner scan = new Scanner(System.in);
        start = scan.nextInt();
        end = scan.nextInt();
        for(i=start+1; i<=end; i++)
        {
            count = 0;
            for(j=2; j<i; j++)
            {
                if(i%j == 0)
                {
                    count++;
                    break;
                }
            }
            if(count == 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}
