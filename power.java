//write a program to calculate power of number 
import java.util.Scanner;
public class power
{
    public static void main(String[] args)
    {
        int n,p,result=1;
        System.out.print("enter number ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        System.out.print("enter power ");
        p=r.nextInt();
        for(int i=1;i<=p;i++)
        {
            result=n*result;
        }
        System.out.print("power "+result);

    }
}