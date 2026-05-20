/*7)Write a Java program to copy one string into another string.
Using assignment operator
By copying each character manually */

import java.util.*;
public class Day3_Task_7 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        String str1=str; 
        System.out.println("Copied string using assignment operator: "+str1);
        sc.close();
    }
    
}
