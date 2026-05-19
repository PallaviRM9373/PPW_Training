/*Q18. Write a java program to input basic salary of an employee and calculate its Gross salary according 
     to following.
     Basic Salary <= 10000 : HRA = 20%, DA = 80% Basic Salary <= 20000 : HRA = 25%, DA = 90% Basic Salary > 20000 : HRA = 30%, DA = 95%*/

import java.util.*;
public class Task18 
{
    public static void main(String[]args)
    {
        System.out.println("Enter the basic salary of an employee:");
        Scanner sc=new Scanner(System.in);
        double basic=sc.nextDouble();
        double hra,da,gross;
        if(basic<=10000)
        {
            hra=(20*basic)/100;
            da=(80*basic)/100;
        }
        else if(basic<=20000)
        {
            hra=(25*basic)/100;
            da=(90*basic)/100;
        }
        else
        {
            hra=(30*basic)/100;
            da=(95*basic)/100;
        }
        gross=basic+hra+da;
        System.out.println("The gross salary of the employee is: "+gross);
        sc.close();
    }
    
}
