//Q16. Write a Java program to check whether a number is positive , negative or zero.

import java.util.*;
public class Positive_neg 
{
    public static void main(String[]args)
    {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0)
        {
            System.out.println(n+" is a Positive Number");
        }
        else if(n<0)
        {
            System.out.println(n+" is a Negative Number");
        }
        else
        {
            System.out.println(n+" is Zero");
        }
        sc.close();
    }
    
}
