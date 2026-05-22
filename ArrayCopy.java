/*Q8.Copy Array Elements into Another Array
Class: ArrayCopy
Functions:
void inputArray(int arr[])
int[] copyArray()
Logic: Loop through source array and store elements into new array.
 */


import java.util.*;
public class ArrayCopy
 {
    int a[];
    void inputArray(int arr[])
    {
        a=arr;
    }

    int[] copyArray()
    {
        int c[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            c[i]=a[i];
        }
        return c;
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
      ArrayCopy ac=new ArrayCopy();
      ac.inputArray(arr);
      int[] copiedArray=ac.copyArray();
      System.out.println("Copied Array Elements:");
      for(int i=0;i<copiedArray.length;i++)
      {
          System.out.print(copiedArray[i]+" ");
      }
      sc.close();
        
     }
    
}
