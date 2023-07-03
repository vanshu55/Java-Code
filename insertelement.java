import java.util.Scanner;
class insertelement
{
    public static void main(String[] args)
    {
        int size,loc,item;
        Scanner r = new Scanner(System.in);
        System.out.print("enter size ");
        size=r.nextInt();
        int a[]=new int[size+1];
        System.out.print("enter array elements ");
        for(int i=0;i<size;i++)
        {
            a[i]=r.nextInt();
        }
        System.out.print("enter  loc ");
        loc=r.nextInt();
        System.out.print("enter item ");
        item=r.nextInt();
        for(int i=size;i>loc;i--)
        {
            a[i]=a[i-1];
        }
        a[loc]=item;
        size++;
        System.out.print("inserted item ");
        for(int i=0;i<size;i++)
        {
            System.out.print(a[i]+" ");
        }



    }
}