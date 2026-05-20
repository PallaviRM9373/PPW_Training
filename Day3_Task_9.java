/*9)Write a Java program to compare two strings.
Using equals()
Using ==
Using equalsIgnoreCase()
Without using library function */


import java.util.*;
public class Day3_Task_9
 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1=sc.nextLine();
        System.out.println("Enter second string:");
        String str2=sc.nextLine();
        
        
        boolean e=str1.equals(str2);
        System.out.println("Using equals(): "+e);
        
        
        boolean e1=(str1==str2);
        System.out.println("Using == operator: "+e1);
        
        
        boolean e3=str1.equalsIgnoreCase(str2);
        System.out.println("Using equalsIgnoreCase(): "+e3);
        
        
        sc.close();
    }
    
}
