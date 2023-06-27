// maximum scalar product of two vector 

class maxscalarproduct
{
   public static void main(String[] args)
   {
    int a1[] = {4,2,6,1,8};
    int a2[] = {6,8,3,9,7};
    int n=a1.length;

    // arrange 1st array in ascending order

     for(int i=0;i<n;i++)
    {
       for(int j=i+1;j<n;j++)
        {
            if(a1[i]>a1[j])
       {
            int temp=a1[i];
            a1[i]=a1[j];
            a1[j]=temp;
        }

        }
     }

     // arrange 2nd array in ascending order

    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
         if(a2[i]>a2[j])
       {
            int temp=a2[i];
            a2[i]=a2[j];
            a2[j]=temp;
        }
        }
    }

int product = 0;
for(int i=0;i<n;i++)
{
    product = product+ (a1[i]*a2[i]);
}
System.out.print(product);
    
   
   }
}