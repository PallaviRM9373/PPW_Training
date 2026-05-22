/*Q10. Count Frequency of Each Element
Class: ArrayFrequency
Functions:
void inputArray(int arr[])
void countFrequency()
Logic: For each element, count how many times it appears using nested loop. */



import java.util.*;
public class ArrayFrequency
 {
    int a[];
    void inputArray(int arr[])
    {
        a=arr;
    }

    void countFrequency()
    {
        boolean visited[]=new boolean[a.length];
        for(int i=0;i<a.length;i++)
        {
            if(visited[i]==true)
            {
                continue;
            }
            
                int count=1;
                for(int j=i+1;j<a.length;j++)
                {
                    if(a[i]==a[j])
                    {
                        count++;
                        visited[j]=true;
                    }
                }
                System.out.println(a[i]+" occurs "+count+" times");
        }
    }
 



    public static void main(String[]args)
    {
        System.out.println("enter the array element");
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        ArrayFrequency af=new ArrayFrequency();
        af.inputArray(arr);
        af.countFrequency();
        sc.close();

    }
}
    

