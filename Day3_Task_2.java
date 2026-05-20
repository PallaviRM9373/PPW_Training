/*2)Merge Two Arrays
Write a program to merge two arrays into a single array.
Example: Array1: [1, 2, 3] Array2: [4, 5, 6] Output: [1, 2, 3, 4, 5, 6]*/




import java.util.*;
public class Day3_Task_2 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  first array:");
        int a[]=new int[3];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the second array:");
        int b[]=new int[3];
        for(int i=0;i<b.length;i++)
        {
            b[i]=sc.nextInt();
        }
        int c[]=new int[a.length+b.length];
        for(int i=0;i<a.length;i++)
        {
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++)
        {
            c[a.length+i]=b[i];
        }
        System.out.println("Merged array is:");
        for(int i=0;i<c.length;i++)
        {
            System.out.print(c[i]+" ");
        }
        sc.close();

    }
}
