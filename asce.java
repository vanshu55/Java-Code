// write a program to arrange elements in ascending order
import java.util.Scanner;
class asce
{
    public static void main(String[] args)
    {
       int a[] = new int[5];
       int i,j,temp;
       System.out.print("enter array elements ");
       Scanner r= new Scanner(System.in);
       for( i=0;i<a.length;i++)
       {
        a[i]=r.nextInt();
       }
      for(i=0;i<a.length;i++)
      {
        for( j=i+1;j<a.length;j++)
        {
        if(a[i]>a[j])
        {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }
      }
      for( i=0;i<a.length;i++)
      {
      System.out.print(a[i]+" " );
      }
       
    }
}