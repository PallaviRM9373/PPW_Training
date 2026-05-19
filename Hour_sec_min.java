//Q10. Write a Java program to convert seconds to hours, minutes and seconds.

import java.util.*;
public class Hour_sec_min 
{
    public static void main(String[]args)
    {
        System.out.println("Enter the seconds:");
        Scanner sc=new Scanner(System.in);
        int sec=sc.nextInt();
        int hours=sec/3600;
        int remaing=sec%3600;
        int minutes=remaing/60;
        int seconds=remaing%60;
        System.out.println(sec+" seconds is equal to "+hours+" hours, "+minutes+" minutes and "+seconds+" seconds.");
        sc.close();
    }
    
}
