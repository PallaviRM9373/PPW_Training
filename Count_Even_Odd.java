//Write a Java program to count even and odd numbers in an array.


import java.util.*;
public class Count_Even_Odd 
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
        int evenC=0;
        int oddC=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                evenC++;
            }
            else
            {
                oddC++;
            }
        }
        System.out.println("Number of even elements in the array: "+evenC);
        System.out.println("Number of odd elements in the array: "+oddC);
        sc.close();
    }
    
}
