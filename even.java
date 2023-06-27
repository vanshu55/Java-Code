// write a program to find even number in given range
import java.util.Scanner;
public class even
{
    public static void main(String[] args)
    {
       int n;
       System.out.print("enter number ");
       Scanner r=new Scanner(System.in);
       n=r.nextInt();
       for(int i=0;i<=n;i=i+2)
       {
        System.out.print(i+" ");
       }
    }
}