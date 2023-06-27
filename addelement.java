// add element using arraylist

import java.util.ArrayList;
class addelement
{
    public static void main(String[] args)
    {
       
       ArrayList<Integer> list=new ArrayList<Integer>();
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);
       list.add(6);
       System.out.print(list);
       list.remove(0);
       System.out.println(list);

        
    }
}
class addelement{
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5};
    int newelement = 6;
    int newarr[] = new int[arr.length+1];
for(int i=0;i<arr.length+1;i++)
{
    newarr[i]=arr[i];
}
newarr[newarr.length-1] = newelement;
for(int i=0;i<newarr.length;i++)
{
    System.out.print(newarr[i]);
}  

}
}