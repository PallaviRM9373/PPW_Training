//Q9. Write a Java program to print the ASCII value of a given character.

import java.util.*;
public class ASCII 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:");
        char c=sc.next().charAt(0);
        int ascii=c;
        System.out.println("The ASCII value of "+c+" is : "+ascii);
        sc.close();
    }
    
}
