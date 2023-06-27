// finding the frequency of element in an array
import java.util.Scanner;
class frequency
{
    public static void main(String[] args)
    {
        int a[] = new int[7];
        System.out.print("enter array elements ");
        Scanner r= new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            a[i]=r.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
        int x=a[i];
       int count=0;
       if(x==-1)continue;
        for(int j=0;j<a.length;j++)
        {
            if(a[j]==x)
            {
                count++;
                a[j]=-1;
            }
        }
        System.out.println("frequency of "+ x +" is "+count);
        }
    }
}