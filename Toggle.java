/*Q12. Write a Java program that takes an alphabet character and toggles its case using ASCII values 
     and operators.
     Example: a → A, Z → z.*/


import java.util.*;
public class Toggle 
{
    public static void main(String[]args)
    {
        System.out.println("Enter an alphabet character:");
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        
        if(ch>=65 && ch<=90)
        {
            ch=(char)(ch+32);
        }
        else if(ch>=97 && ch<=122)
        {
            ch=(char)(ch-32);
        }
        System.out.println("Toggled character is: "+ch);
        sc.close();
    }
    
}
