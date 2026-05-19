//Write a Java program to print array elements in reverse order.

import java.util.*;
public class Array_Reverce 
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
        System.out.println("Elements in reverse order are:");
        int l=a.length-1;
        for(int i=0;i<a.length/2;i++,l--)
        {
            int t=a[i];
            a[i]=a[l];  
            a[l]=t;
            
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
    
}
