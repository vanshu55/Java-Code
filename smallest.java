// write a program to find smallest element
import java.util.Scanner;
class smallest
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
        int smal=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]<smal)
            {
                smal=a[i];
            }
        }
        System.out.print("smallest element "+smal);
    }
}