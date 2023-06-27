// check alphabet or not

import java.util.Scanner;
class alphabet
{
    public static void main(String []args)
    {
        int ch;
        System.out.print("enter char ");
        Scanner r= new Scanner (System.in);
        ch=r.next().charAt(0);
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        {
            System.out.print("alphabet");
        }
        else
        {
            System.out.print("not alphabet");
        }

    }
}