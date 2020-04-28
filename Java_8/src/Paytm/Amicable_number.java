/*
 * Amicable number 
 * A pair is amicable number if sum of divisor (excluding the number itself) of 1st number is equal to 
 * the second number and vice versa.
 * eg:-A pair(220,284)
 * :-220 divisor sum is (1+2+4+5+10+11+20+44+55+110)=284
 * :-284 divisor sum is  (1+2+4+71+142)=220
 */

package Paytm;

import java.util.Scanner;

public class Amicable_number 
{
	 public static void main(String args[])
	   {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("enter a pair of number for check given number is neon or not");
		   int num1=sc.nextInt();
		   int num2=sc.nextInt();
		   int j=2;
		   int first_div_sum=0;
		   int second_div_sum=0;
		   while(j>0)
		   {
			 int sum=1;
			 int num=j==2?num1:num2;
			 
			 for(int i=2;i<num;i++)
			 {
				 if(num%i==0)
				 {
				 sum=sum+i;
				 }
			 }
			 if(j==2)
			 {
				 first_div_sum=sum;
			 }
			 else
			 {
				second_div_sum=sum; 
			 }
			  --j;
		   }
		   
		if(first_div_sum==num2 && second_div_sum==num1)
		{
			System.out.println("given number is amcable number");
		}
		else
		{
			System.out.println("given number is amicable  not number");
		}
	   }
}
