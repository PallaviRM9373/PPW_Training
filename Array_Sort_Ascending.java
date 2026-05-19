//Write a Java program to sort array elements in ascending order.


import java.util.*;
public class Array_Sort_Ascending 
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
        int A=a[0];
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    A=a[i];
                    a[i]=a[j];
                    a[j]=A;
                }
            }
        }
        System.out.println("Elements in ascending order are:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        sc.close();
    }
    
}
