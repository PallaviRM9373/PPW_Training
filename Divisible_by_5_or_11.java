//Q17. Write a Java program to check whether a number is divisible by 5 and 11 or not. 


import java.util.*;
public class Divisible_by_5_or_11 
{
    public static void main(String[]args)
    {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%5==0 && n%11==0)
        {
            System.out.println(n+" is divisible by 5 and 11");
        }
        else
        {
            System.out.println(n+" is not divisible by 5 and 11");
        }
        sc.close();
    }
    
}
