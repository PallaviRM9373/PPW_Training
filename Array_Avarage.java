//Write a Java program to find the average of array elements.


import java.util.*;
public class Array_Avarage 
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
        double average=(double)sum/a.length;
        System.out.println("Average of all elements in the array is: "+average);
        sc.close();
    }
    
}
