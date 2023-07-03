import java.util.Scanner;
class prime 
{
    public static void main(String[] args)
    {
        int n,count=0;
        Scanner r= new Scanner(System.in);
        System.out.print("enter number ");
        n=r.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.print("prime number");
        }
        else{
            System.out.print("not prime number");
        }
        
    }
}