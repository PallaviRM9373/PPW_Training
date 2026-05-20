/*14)Write a Java program to count total number of words in a string.
Example: "I love india" → 3
Using split("\\s+")
Without using library function */


import java.util.*;
public class Day3_Task14
 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        
        
        String[] words=str.split("\\s+");
        int count=words.length;
        System.out.println("Total number of words in the string is: "+count);
        
        
        sc.close();
    }
    
}
