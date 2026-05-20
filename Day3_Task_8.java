/*8)Write a Java program to concatenate two strings.
Using + operator
Using concat() method
Without using library function
 */


import java.util.*;
public class Day3_Task_8 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1=sc.nextLine();
        System.out.println("Enter second string:");
        String str2=sc.nextLine();
        
        
        String concat1=str1+" "+str2;
        System.out.println("Concatenated string using + operator: "+concat1);
        
        
        String concat2=str1.concat(" "+str2);
        System.out.println("Concatenated string using concat() method: "+concat2);
        
        
        sc.close();
    } 
}
