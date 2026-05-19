//Q13. Write a Java program to check whether a number is even or odd. 


import java.util.*;
public class Even_Odd
 {
    public static void main(String[]args)
    {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0)
        {
            System.out.println(n+" is an Even Number");
        }
        else
        {
            System.out.println(n+" is an Odd Number");
        }
        sc.close();
    }
    
}
