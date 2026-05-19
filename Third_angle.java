// Q4. Write a java program to enter two angles of a triangle and find the third angle.
import java.util.*;
public class Third_angle 
{
    public static void main(String[]args)
    {
        System.out.println("Enter two angles of a triangle:");
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int third;
        third=180-(a+b);
        System.out.println("The third angle value is : "+third);
        sc.close();
    }  
    
}
