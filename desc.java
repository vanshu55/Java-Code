//write a program to arrange elements in descending order
import java.util.Scanner;
class desc
{
    public static void main(String[] args)
    {
        int a[] = new int[5];
        int temp;
        System.out.print("enter array elements ");
        Scanner r= new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]<a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

            }
        }
        System.out.print("descending order ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}