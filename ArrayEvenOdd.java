/*Q5.Count Even and Odd Numbers
Class: ArrayEvenOdd
Functions:
void inputArray(int arr[])
int countEven()
int countOdd()
Logic: Use % 2 == 0 check. */


import java.util.*;
public class ArrayEvenOdd
 {
     int a[];
     int even=0;
     int Odd=0;
  void inputArray(int arr[])
  {
     a=arr;  
  }
  

  int countEven()
  {
     for(int i=0;i<a.length;i++)
     {
        if(a[i]%2==0)
        {

            even++;
        }
     }
     return even;

  }

  int countOdd()
  {
     for(int i=0;i<a.length;i++)
     {
        if(a[i]%2!=0)
        {

            Odd++;
        }
     }
     return Odd;

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
  ArrayEvenOdd eo=new ArrayEvenOdd();
  eo.inputArray(arr);
  int e=eo.countEven();
  System.out.println("the total even number in the array is : "+e);
  int o=eo.countOdd();
  System.out.println("the total odd number in the array is : "+o);
  sc.close();
}
 }
