/*15)Write a Java program to reverse a string. */



import java.util.*;
public class Day3_Task15
 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();

        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println("Reversed string is: "+rev);
        sc.close();
    }
    
}
