import java.util.Scanner;
class fibonacci
{
    public static void main(String[] args)
    {
        int a=0,b=1,c,term;
        Scanner r= new Scanner(System.in);
        System.out.print("enter term ");
        term=r.nextInt();
        for(int i=1;i<=term;i++)
        {
            System.out.print(a+" ");
          c=a+b;
          a=b;
          b=c;
        }

    }
}