import java.util.Scanner;
class palindrome
{
    public static void main(String[] args)
    {
        int n,a,sum=0;
        Scanner rr = new Scanner(System.in);
        System.out.print("enter number ");
        n=rr.nextInt();
        a=n;
        while(n>0)
        {
            int r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(a==sum)
        {
            System.out.print("palindrome");
        }
        else
        {
            System.out.print("not ");
        }
    }
}