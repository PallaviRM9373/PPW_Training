/*5)Write a Java program to find transpose of a matrix.Enter matrix elements:
1 2
3 4Transpose Matrix:
1 3
2 4 */


import java.util.*;
public class Day3_Task_5
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
        System.out.println("Transpose Matrix:");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
               System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
