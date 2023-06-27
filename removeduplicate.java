// removing duplicate element in an array
import java.util.Scanner;
class removeduplicate
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
        for(int j=i+1;j<a.length;j++)
        {
           if(a[i]==a[j])
           {
            a[i]=-1;
           }
        }
        }
        System.out.print("remove element ");
        for(int i=0;i<a.length;i++)
        {
           if(a[i]!=-1)
           {
            System.out.print(a[i]+" ");
           }
        }
    }
}