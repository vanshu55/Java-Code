import java.util.Scanner;
class copymatrix
{
    public static void main(String[] args)
    {
        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        Scanner r= new Scanner(System.in);
        System.out.print("enter elements ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j]=r.nextInt();
            }
        }
        System.out.println("print matrix ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
                }
        System.out.println("copy matrix ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                b[i][j]=a[i][j];
                System.out.print(b[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}