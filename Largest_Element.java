//Write a Java program to find the largest element in an array.

import java.util.*;
public class Largest_Element
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
        int l=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>l)
            {
                l=a[i];
            }
        }
        System.out.println("Largest element in the array is: "+l);
        sc.close();
    }
    
}
