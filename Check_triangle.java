//Q15. Write a Java program to check whether a triangle is equilateral , isoscale or scalene.

import java.util.*;
public class Check_triangle 
{
    public static void main(String[]args)
    {
        System.out.println("enter the three side value of the triangle");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a==b && b==c)
        {
            System.out.println("The triangle is Equilateral");
        }
        else if(a==b || b==c || c==a)
        {
            System.out.println("The triangle is Isoscale");
        }
        else
        {
            System.out.println("The triangle is Scalene");
        }
        sc.close();
    }
    
}
