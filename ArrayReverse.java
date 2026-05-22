/*Q6. Reverse the Array
Class: ArrayReverse
Functions:
void inputArray(int arr[])
void reverseArray() */


import java.util.*;
public class ArrayReverse 
{
    int avg[];
    
    void inputArray(int arr[])
    {
       avg=arr;
    }

    void reverseArray()
    {
        int l=avg.length-1;
        for(int i=0;i<l/2;i++,l--)
        {
           int t=avg[i];
           avg[i]=avg[l];
           avg[l]=t;
        }
         for(int i=0;i<avg.length;i++)
        {
            System.out.print(avg[i]+" ");
        }
        
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
  ArrayReverse as=new ArrayReverse();
  as.inputArray(arr);
  as.reverseArray();
  sc.close();

}
    
}
