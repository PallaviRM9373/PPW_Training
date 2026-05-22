/*Q3. Calculate Average of Array Elements
Class: ArrayAverage
Functions:
void inputArray(int arr[])
double findAverage() */



import java.util.*;
public class ArrayAverage 
{
    int a[];
    void inputArray(int arr[])
    {
        a=arr;
    }

    double findAverage()
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        double avg=(double)sum/a.length;
        return avg;
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
  ArrayAverage av=new ArrayAverage();
  av.inputArray(arr);
  double res=av.findAverage();
  System.out.println("the average of the given array is : "+res);
  sc.close();
    
}
}
