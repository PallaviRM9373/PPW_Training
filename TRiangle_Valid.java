//Q14. Write a Java program to check whether a triangle is valid or not.



import java.util.*;
public class TRiangle_Valid
 {
    public static void main(String[]args)
    {
        System.out.println("enter the three side value of the triangle");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a+b+c==180)
        {
            System.out.println("The triangle is valid");
        }
        else
        {
            System.out.println("The triangle is not valid");
        }
        sc.close();
    }
    
}
