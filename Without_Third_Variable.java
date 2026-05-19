//Q8. Write a java program swap two number without using third variable. 

import java.util.*;
public class Without_Third_Variable {
    public static void main(String[]args)
    {
        System.out.println("Enter the two numbers:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Before swaping the value of a is: "+a);
        System.out.println("Before swaping the value of b is: "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swaping the value of a is: "+a);
        System.out.println("After swaping the value of b is: "+b);
        sc.close();
    }
}
