/*
 * the neon number has sum of digits of square of numbers equal to the original numbers
 * 
 * eg:9
 * :-9*9=81.............(8+1=9) so it is a  neon number
 * 
 * eg:12
 * 12*12=144, sum of digits =1+4+4=9, therefore 12 is not a neon number
 * 
 */

package Paytm;

import java.util.Scanner;

public class Neon 
{
   public static void main(String args[])
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter a number for check given number is neon or not");
	   int num=sc.nextInt();
	   
	   int square1=num*num;
        int sum=0;
	   
	   while(square1!=0)
	   {
		   int temp=square1%10;
		   sum=temp+sum;
		   square1=square1/10;
	   }
	   
	   if(num==sum)
	   {
		   System.out.println("given number is neon number");
	   }
	   else
	   {
		   System.out.println("iven number is not a neon number");
	   }
   }
}
