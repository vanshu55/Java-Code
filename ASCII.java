//write a program to find ASCII value of character
import java.util.Scanner;
public class ASCII
{
    public static void main(String[] args)
    {
        char ch;
        System.out.print("enter char ");
        Scanner r=new Scanner (System.in);
        ch =r.next().charAt(0);
        int a=ch;
        System.out.print("ASCII "+a);
    }
}