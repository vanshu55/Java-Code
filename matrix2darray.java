import java.util.Scanner;
class matrix2darray
{
    public static void main(String[] args)
    {
      int arr[][] = new int[3][3];
      Scanner r= new Scanner(System.in);
      System.out.print("enter array elements ");
      for(int i=0;i<3;i++)
      {
        for(int j=0;j<3;j++)
        {
            arr[i][j]=r.nextInt();
        }
      }
      System.out.print("matrix : \n");
      for(int i=0; i<3; i++)
      {
        for(int j=0; j<3; j++)
        {
       System.out.print(arr[i][j]+" ");
        }
      
      System.out.print("\n");
      }

    }
}