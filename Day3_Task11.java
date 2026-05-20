/*11)Write a Java program to toggle case of each character in a string.
 */



import java.util.*;
public class Day3_Task11
 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z')
            {
                ch=(char)(ch-32);
            }
            else if(ch>='A' && ch<='Z')
            {
                ch=(char)(ch+32);
            }
            System.out.print(ch);
        }
        sc.close();
    }
    
}
