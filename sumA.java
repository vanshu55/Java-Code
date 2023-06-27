// write a program to calculate sum of element in array
import java.util.Scanner;
class sumA
{
    public static void main(String[] args)
    {
        int a[] = new int[5];
        int sum=0;
        System.out.print("enter array elements ");
        Scanner r= new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.print("sum of array elements "+sum);
    }
}