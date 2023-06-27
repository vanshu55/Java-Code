/*class copyarray
{
    public static void main(String[] args)
    {
        int a[]={1,2,3,4};
        int b[]=new int[4];
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.print("\ncoping array ");
        for(int i=0;i<a.length;i++)
        {
            b[i]=a[i];
            System.out.print(b[i]+" ");
        }
        
    }
}*/

import java.util.Arrays;   
public class copyarray 
{   
public static void main(String[] args)   
{   
   
int [] array = new int [] {90, 23, 5, 109};  
 
Arrays.sort(array);   
System.out.println("ascending order: ");  
  
for (int i = 0; i < array.length; i++)   
{       
System.out.print(array[i]+" ");   
}   
}  
}  