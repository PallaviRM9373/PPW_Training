/*Q11. Find Second Largest Element
Class: ArraySecondLargest
Functions:
void inputArray(int arr[])
int findSecondLargest()
Logic: First find max, then find element just smaller than max. */


import java.util.*;
public class ArraySecondLargest
{
    int a[];
    void inputArray(int arr[])
    {
        a=arr;
    }

    int findSecondLargest()
    {
        int max=a[0];
        int secondMax=a[0];;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                secondMax=max;
                max=a[i];
            }
            else if(a[i]>secondMax && a[i]!=max)
            {
                secondMax=a[i];
            }
        }
        return secondMax;
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
      ArraySecondLargest asl=new ArraySecondLargest();
      asl.inputArray(arr);
      int result=asl.findSecondLargest();
      System.out.println("the second largest element in the given array is : "+result);
      sc.close();
        
     }
}
    

