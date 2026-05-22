/*Q9. Merge Two Arrays
Class: ArrayMerge
Functions:
void inputArray(int arr1[], int arr2[])
int[] mergeArrays()
Logic: Create new array of size arr1.length + arr2.length and copy both arrays into it. */



import java.util.*;
public class ArrayMerge
 {
    int arr1[];
    int arr2[];
    void inputArray(int a1[],int a2[])
    {
         arr1=a1;
         arr2=a2;
    }

    int [] mergeArray()
    {
        int a3[]=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++)
        {
            a3[i]=arr1[i];
        }
        for(int i=0;i<arr2.length;i++)
        {
            a3[arr1.length+i]=arr2[i];
        }
        return a3;
    }
    
    public static void maiin(String[]args)
    {
        System.out.println("Enter the array element");
       Scanner sc=new Scanner(System.in);
       int a1[]=new int[2];
        int a2[]=new int[3];
           for(int i=0;i<a1.length;i++)
            {
               a1[i]=sc.nextInt();
            }
            for(int i=0;i<a2.length;i++)
            {
               a2[i]=sc.nextInt();
            }
            ArrayMerge am=new ArrayMerge();
            am.inputArray(a1, a2);
            int[] mergedArray=am.mergeArray();
            System.out.println("Merged Array Elements:");
            for(int i=0;i<mergedArray.length;i++)
            {
                System.out.print(mergedArray[i]+" ");
            }
            sc.close();
    }
    
}
