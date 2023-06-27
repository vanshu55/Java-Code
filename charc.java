// write a program to print character
import java.util.Scanner;
public class charc{
    public static void main(String[] args)
    {
        char ch;
        System.out.print("enter character ");
        Scanner r=new Scanner(System.in);
        ch=r.next().charAt(3);
        System.out.print(ch);
    }
}