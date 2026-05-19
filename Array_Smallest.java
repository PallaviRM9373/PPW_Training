//Write a Java program to find the smallest element in an array


import java.util.*;
public class Array_Smallest
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
        int s=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]<s)
            {
                s=a[i];
            }
        }
        System.out.println("Smallest element in the array is: "+s);
        sc.close();
    }
    
}
