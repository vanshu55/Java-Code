// write a program to calculate sum of 1st n natural number
import java.util.Scanner;
public class add{
    public static void main(String[] args) {
        int n,sum=0;
		System.out.print("enter number ");
		Scanner r= new Scanner(System.in);
		n=r.nextInt();
		for(int i=1;i<=n;i++)
		{
		    sum=sum+i;
		   
		}
		 System.out.print("sum "+sum);
		
	
	}
}


    
