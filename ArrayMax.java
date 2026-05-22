

import java.util.*;
public class ArrayMax
 {
    int ar[];
   void inputArray(int a[])
   {
      ar=a;
   
   }

   int findMax()
   {
  int max=ar[0];
  for(int i=0;i<ar.length;i++)
     {
    if(max<ar[i])
      {
        max=ar[i];
      }
   }
   return max;

  }

  int findMin()
   {
  int min=ar[0];
  for(int i=0;i<ar.length;i++)
     {
    if(min>ar[i])
      {
        min=ar[i];
      }
   }
   return min;

  }

public static void main(String[]args)
{
    
  System.out.println("Enter the array element");
  Scanner sc=new Scanner(System.in);
  int arr[]=new int[5];

  for(int i=0;i<arr.length;i++)
  {
    arr[i]=sc.nextInt();
  }

ArrayMax m=new ArrayMax();
m.inputArray(arr);
int result = m.findMax();
System.out.println("the maximum value in the given array is : "+result);
int r1=m.findMin();
System.out.println("the maximum value in the given array is : "+r1);
 
sc.close();

}
    
}
