/*
 * Automorphic number is automorphic if its square ends with the same digits as the original 
 * number.
 * 
 * ex:-76
 * 76*76=5776,Number is automorphic.........here in a 5776 last digit match with 76 so it is automorphic
 * 
 * ex:7
 * 7*7 =49, Number is not automorphic 
 */

package Paytm;
import java.util.*;
public class Automorphic
{
     public static void main(String args[])
     {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("enter a number for check give  number is automorphic or not");
    	 int num=sc.nextInt();
    	 int square=num*num;
    	 System.out.println("square of given number is "+square);
    	 
    	 
    	System.out.println("given number is "+Automor(num)+" for automorphic");
     }

	
	public static boolean Automor(int num)
	{
		//int num=num;
		int square=num*num;
		 while(num>0)
    	 {
    		 if(num%10 != square%10)
    		 {
    			return false; 
    		 }
    		 num=num/10;
    		 square=square/10;
    	 }
		 return true;
	}
	
}
