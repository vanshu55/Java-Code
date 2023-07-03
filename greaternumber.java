import java.util.Scanner;
class greaternumber
{
    public static void main(String[]args)
    {
        int a,b;
        Scanner r= new Scanner(System.in);
        System.out.print("enter a and b ");
        a=r.nextInt();
        b=r.nextInt();

        if(a>b)
        {
            System.out.print(a);
        }
        else 
        {
            System.out.print(b);
        }
    }
}