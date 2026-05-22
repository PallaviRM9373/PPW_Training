
import java.util.*;
public class ArraySum 
{
int s[];
void inputArray(int a[])
{
  s=a;
}
 int calculateSum()
 {
    int sum=0;
    for(int i=0;i<s.length;i++)
    {
        sum=sum+s[i];
    }
    return sum;
     
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
  ArraySum ss=new ArraySum();
  ss.inputArray(arr);
  int res=ss.calculateSum();
  System.out.println(res);
  sc.close();

}

    
}
