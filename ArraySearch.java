/*Q4. Search an Element in Array
Class: ArraySearch
Functions:
void inputArray(int arr[])
boolean searchElement(int key)
Logic: Traverse array, check if key matches any element.
 */



import java.util.*;
public class ArraySearch
 {


    int a[];
    void inputArray(int arr[])
    {
        a=arr;
    }
  boolean searchElement(int key)
  {
    for(int i=0;i<a.length;i++)
    {
        if(a[i]==key)
        {
            return true;
        }
    }
    return false;

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
        System.out.println("Enter the key element to search:");
        int key=sc.nextInt();
        boolean found=false;
        ArraySearch as=new ArraySearch();
        as.inputArray(arr);
        found=as.searchElement(key);
        if(found==true)
        {
            System.out.println("Element found in the array.");
        }
        else
        {
            System.out.println("Element not found in the array.");
        }
        
     sc.close();
    }
    
}
