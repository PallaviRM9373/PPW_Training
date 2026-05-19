//Write a Java program to copy all elements from one array to another array.


import java.util.*;
public class Array_One_To_Anather 
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
        int b[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            b[i]=a[i];
        }
        System.out.println("Elements in the second array are:");
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i]+" ");
        }
        sc.close();
    }
    
}
