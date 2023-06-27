// write a program to count number of digits

import java.util.Scanner;
class count{
    public static void main(String[] args)
{
    int n,count=0;
    System.out.print("enter number ");
    Scanner r=new Scanner(System.in);
    n=r.nextInt();
    while(n>0)
    {
        n=n/10;
        count++;
    }
    System.out.print("no.of digits "+count);

}
}