/*10)Write a Java program to convert lowercase string to uppercase.
Write a Java program to convert uppercase string to lowercase. */

import java.util.*;
public class Day3_Task10
 {
    public static void main(String[]args)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string:");
    String str=sc.nextLine();
    String U=str.toUpperCase();
    System.out.println("String in uppercase: "+U);
    String L=str.toLowerCase();
    System.out.println("String in lowercase: "+L);

    sc.close();
    }
    
}
