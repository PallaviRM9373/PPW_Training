/*3)Check Array is Palindrome or Not
Input:
1 2 3 2 1
Output:
Palindrome Array*/


import java.util.*;
public class Day3_Task_3 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        boolean p=true;
        int n=a.length;
        for(int i=0;i<a.length/2;i++,n--)
        {
            if(a[i]!=a[a.length-n])
            {
                p=false;
                break;
            }
        }
        if(p==true)
        {
            System.out.println("Palindrome Array");
        }
        else
        {
            System.out.println("Not a Palindrome Array");
        }
        sc.close();
    }
    
}
