// finding non repeating element in an array
import java.util.Scanner;
class nonduplicate
{
    public static void main(String[] args)
    {
        int a[] = new int[5];
        System.out.print("enter array elements ");
        Scanner r=new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            int x=a[i];
           int count=0;
            for(int j=0;j<a.length;j++)
            {
                if(a[j]==x)
                {
                    count++;
                }
            }
            if(count==1)
            {
                System.out.print(x+" ");
            }
        }
    }
}