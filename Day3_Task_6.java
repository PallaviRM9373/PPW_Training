/*6)Write a Java program to find the length of a string.
Example: "pune" → 4 */


import java.util.*;
public class Day3_Task_6 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        int len=str.length();
        System.out.println("Length of the string is: "+len);
        sc.close();
    }
    
}
