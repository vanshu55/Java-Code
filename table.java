// write a program to print multiplication table

import java.util.Scanner;
class table{
    public static void main(String[] args)
    {
        int n;
        System.out.print("enter number ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();
        for(int i=1;i<=10;i++)
        {
        System.out.println(n + " * " + i + " = "+ n*i);
        }
    }
}