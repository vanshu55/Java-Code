import java.util.Scanner;
class deletedelement
{
    public static void main(String[] args)
    {
      int size,loc;
      Scanner r= new Scanner(System.in);
      System.out.print("enter size ");
      size=r.nextInt();
      int a[] = new int[size];
      System.out.print("enter element ");
      for(int i=0;i<size;i++)
      {
        a[i]=r.nextInt();
      }
      System.out.print("enter location ");
      loc=r.nextInt();
      
      for(int i=loc;i<size-1;i++)
      {
        a[i]=a[i+1];
      }
      size--;
      System.out.print("deleted elements ");
      for(int i=0;i<size;i++)
      {
        System.out.print(a[i]+" ");
      }
         
    }
    
    }