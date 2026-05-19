//Write a Java program to search an element in an array.


import java.util.*;
public class Array_Searching
 {
    public static void main(String[]args)
    {
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 elements in the array:");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int s=sc.nextInt();
        int flag=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==s)
            {
                flag=1;
                
                break;
            }
        }
        if(flag==1)
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
