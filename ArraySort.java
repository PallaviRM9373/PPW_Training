/*Q7. Sort Array in Ascending Order
Class: ArraySort
Functions:
void inputArray(int arr[])
void sortArray()
Logic: Use Bubble Sort / Selection Sort.*/


import java.util.*;
public class ArraySort
 {
        int a[];
        void inputArray(int arr[])
        {
            a=arr;
        }
    
        void sortArray()
        {
            for(int i=0;i<a.length-1;i++)
            {
                for(int j=0;j<a.length-1-i;j++)
                {
                    if(a[j]>a[j+1])
                    {
                        int t=a[j];
                        a[j]=a[j+1];
                        a[j+1]=t;
                    }
                }
            }
            System.out.println("Sorted array in ascending order:");
            for(int i=0;i<a.length;i++)
            {
                System.out.print(a[i]+" ");
            }
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
        ArraySort as=new ArraySort();
        as.inputArray(arr);
        as.sortArray();
        sc.close();
            
        }

    
}
