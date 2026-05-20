/*4)Write a Java program to find sum of all elements in a 2D array.
Example

Input:

1 2
3 4

Output:

Sum = 10 */


import java.util.*;
public class Day3_Task_4
 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int [][]a=new int[3][3];
    
        System.out.println("Enter the elements of the 2D array:");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                a[i][j]=sc.nextInt();
            }

        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
               System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                sum+=a[i][j];
            }
        }
        System.out.println("Sum = "+sum);
        sc.close();
    }
    
}
