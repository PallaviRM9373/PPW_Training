/*Q12. Check Array is Palindrome or Not
Class: ArrayPalindrome
Functions:
void inputArray(int arr[])
boolean isPalindrome()
Logic: Compare arr[i] with arr[n-i-1]. */


import java.util.*;
public class ArrayPalindrome 
{
    int a[];
    void inputArray(int arr[])
    {
        a=arr;
    }

    boolean isPalindrome()
    {
        int n=a.length-1;
        for(int i=0;i<n/2;i++,n--)
        {
            if(a[i]==a[n-i])
            {
                continue;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args)
    {
        System.out.println("Enter the array element");
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        ArrayPalindrome ap=new ArrayPalindrome();
        ap.inputArray(arr);
        boolean res=ap.isPalindrome();
        if(res==true)
        {
            System.out.println("The given array is a palindrome.");
        }
        else
        {
            System.out.println("The given array is not a palindrome.");
        }
        sc.close();
    }
}
