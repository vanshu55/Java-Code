// write a program to calculate sum of even or odd number in a given range
import java.util.Scanner;
class sum{
    public static void main(String[] args)
    {
        int n,sum=0;
        System.out.print("enter number ");
        Scanner r= new Scanner(System.in);
        n=r.nextInt();
        if(n%2==0)
        {
        for(int i=0;i<=n;i=i+2)
        {
                sum=sum+i;     }
        
          System.out.print("sum of even no. "+sum);
        }
          else
          {
            for(int i=1;i<=n;i=i+2)
            {
                    sum=sum+i;
                }
                System.out.print("sum of odd no. "+sum);
            }
        
        }

    }
