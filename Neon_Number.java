/*Q11. Write a java program to check whether number is neon or not.
     Input : 9
     Output : Neon Number Explanation: square is 9*9 = 81 
	 and sum of the digits of the square is 9.*/


import java.util.*;
public class Neon_Number 
{ 
    public static void main(String[]args)
    {
        System.out.println("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=n*n;
        int sum=0;
        while(s>0)
        {
            int r=s%10;
            sum=sum+r;
            s=s/10;
        }
        if(sum==n)
        {
            System.out.println(n+" is a Neon Number");
        }
        else
        {
            System.out.println(n+" is not a Neon Number");
        }
        sc.close();
    }
    
}
