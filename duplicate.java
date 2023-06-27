// finding duplicate element in an array
import java.util.Scanner;
class duplicate
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
        System.out.print("duplicate element ");
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.print(a[i]+" ");
                }
            }
        }
    }
}