//Write a Java program to find the sum of all elements of an array.


import java.util.*;
public class Array_Sum 
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
    int sum=0;
    for(int i=0;i<a.length;i++)
    {
        sum=sum+a[i];
    }
    System.out.println("Sum of all elements in the array is: "+sum);
    sc.close();
   }
    
}
