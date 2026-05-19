//Q7. Write a java program swap two number using third variable.
import java.util.*;
public class Swaping 
{
    public static void main(String[]args)
    {
        System.out.println("Enter the two numbers:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swaping the value of a is: "+a);
        System.out.println("After swaping the value of b is: "+b);
        sc.close();
    }
    
}
