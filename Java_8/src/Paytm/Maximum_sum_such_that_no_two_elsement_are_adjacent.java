/*
 * given an array find the maximum sum of a subsequence with the constraint that no2 numbers 
 * in the subsequence should be adjacent in the array
 * 
 * eg:-1
 * input{5,5,10,100,10,5}
 * output{110}
 * 
 * eg:-2
 * input {1,2,3}
 * output{4}
 * 
 * eg:-{1,20,3}
 * output:-20
 */
package Paytm;

import java.util.Scanner;

public class Maximum_sum_such_that_no_two_elsement_are_adjacent
{
public static void main(String args[])
{
	 Scanner sc=new Scanner(System.in);
	 int sum_1=0;
	 int sum_2=0;
	 System.out.println("enter the of an array");
	 int size=sc.nextInt();
	 int arr[]=new int[size];
	 int temp=0;
	 
	 System.out.println("enter the value in the array");
	 for(int i=0;i<size;i++)
	 {
		 arr[i]=sc.nextInt();
		 
		 if(temp==0)
		 {
			 sum_2=sum_2+arr[i];
			 temp=1;
		 }
		 else
		 {
			 sum_1=sum_1+arr[i];
			 temp=0;
		 }
	 }
	 
	 int max=0;
	 if(sum_1>sum_2)
	 {
		 max=sum_1;
	 }
	 else
	 {
		 max=sum_2;
	 }
				 
	 System.out.println("maximum sum is "+max);
	 
	 
}
}
