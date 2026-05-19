//Q2. Write a java program to input all basic data types and print its output.

import java.util.*;
public class Datatype_input_basic {

	public static void main(String[] args)
	{
		
       Scanner sc= new Scanner(System.in);
         int a=sc.nextInt();
         System.out.println("The integer number: "+a);
         float f=sc.nextFloat();
         System.out.println("The Float number: "+f);
         double d=sc.nextDouble();
         System.out.println("The Double number: "+d);
         char c=sc.next().charAt(0);
         System.out.println("The character is: "+c);
         String s=sc.nextLine();
         System.out.println("The String is :"+s);
         Boolean b=sc.nextBoolean();
         System.out.println("The boolean is: "+b);
         sc.close();
	}

}
