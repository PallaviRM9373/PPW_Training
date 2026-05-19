// Q5. Write a java program to enter marks of five subjects and calculate total marks and percentage.
import java.util.*;
public class Total_marks_percentage
 {
    public static void main(String[]args)
    {
       System.out.println("enter the five subject marks : ");
       Scanner sc=new Scanner(System.in);
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int s3=sc.nextInt();
        int s4=sc.nextInt();
        int s5=sc.nextInt();
        int total=s1+s2+s3+s4+s5;
        float percentage=(total/5);
        System.out.println("The total marks is : "+total);
        System.out.println("The percentage is : "+percentage);
        sc.close();
    }
    
}
