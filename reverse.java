//write a program to print array elements in reverse order
import java.util.Scanner;
class reverse
{
    public static void main(String[] args)
    {
        int a[] = new int[5];
        System.out.print("enter array elements ");
        Scanner r= new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
    }
}