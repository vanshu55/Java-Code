import java.util.Scanner;
class addmatrix
{
    public static void main(String[] args)
    {
        int sum=0;
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int c[][] = new int[2][2];
        System.out.print("enter first matrix ");
        Scanner r= new Scanner(System.in);
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j]=r.nextInt();
            }
        }
        System.out.print("enter sec matrix ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                b[i][j]=r.nextInt();
            }
        }

        System.out.println("first matrix ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }

        System.out.println(" sec matrix ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.print("\n");
        }

        System.out.print("sum of matrix :\n");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
               c[i][j]=a[i][j]+b[i][j];
               System.out.print(c[i][j]+" ");
            }
            
            System.out.print("\n");
        }
        
    }
}