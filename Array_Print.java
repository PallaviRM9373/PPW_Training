//Write a Java program to input 5 elements in an array and print all elements



import java.util.*;
public class Array_Print
 {
    public static void main(String[]args)
    {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 elements in the array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Elements in the array are:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
