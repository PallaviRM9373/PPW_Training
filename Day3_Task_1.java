/*1)Find Duplicate Elements
Write a program to print duplicate elements in an array.
Example: Input: [1, 2, 3, 2, 4, 1] Output: 1 2 */

import java.util.*;
public class Day3_Task_1
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
        System.out.println("Duplicate elements in the array are:");
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.print(a[i]+" ");
                    break;
                }
            }
        }
        sc.close();
    }

}
