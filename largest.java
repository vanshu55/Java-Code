// write a program to find largest elements
import java.util.Scanner;
class largest
{
    public static void main(String[] args)
    {
        int a[] = new int[5];
        System.out.print("enter array elements");
        Scanner r= new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
        int max=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.print("maxi elements "+max);
    }
}