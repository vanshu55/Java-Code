import java.util.Scanner;
class minscalarproduct
{
  public static void main(String[] args)
  {
    int a1[] = new int[5];
    int a2[] = new int[5];
    System.out.print("enter arr1 elements ");
    Scanner r= new Scanner(System.in);
    for(int i=0;i<a1.length;i++)
    {
        a1[i] = r.nextInt();
    }
    System.out.print("enter arr2 elements ");
    for(int i=0;i<a2.length;i++)
    {
        a2[i] = r.nextInt();
    }

    // arrange in ascending order
  
    System.out.print("ascending order ");
    for(int i=0;i<a1.length;i++)
    {
        for(int j=i+1;j<a1.length;j++)
        {
            if(a1[i]>a1[j])
            {
                int temp=a1[i];
                a1[i]=a1[j];
                a1[j]=temp;
            }
        }
    }
    for(int i=0;i<a1.length;i++)
    {
        System.out.print(a1[i]+" ");
    }
    System.out.print("descending order ");
    // arrange in descending order

    for(int i=0;i<a2.length;i++)
    {
        for(int j=i+1;j<a2.length;j++)
        {
            if(a2[i]<a2[j])
            {
                int temp=a2[i];
                a2[i]=a2[j];
                a2[j]=temp;
            }
        }
    }
    for(int i=0;i<a2.length;i++)
    {
        System.out.print(a2[i]+" ");
    }
    int product=0;
    for(int i=0;i<a1.length;i++)
    {
        product=product+(a1[i]*a2[i]);
    }
     System.out.print(product);
  }
}