/*
 * ->the cost of a stock on each day is given in an array ,find the days on which we should buy and
 * sell the stock so as to attain maximum profit
 * ->for example let's say that the given price of stock is represented by the array {100,180,260,
 * 310,40,535,695}
 * ->maximum profit can be earned as follows
 * 1.buy on day 0 and sell on day 3
 * 2.buy on day 4 and sell on day 6
 */
package Paytm;

import java.util.Arrays;
import java.util.Scanner;

public class Stock_buy_sell_to_maximize_profit 
{
  public static void main(String args[])
  {
	 // Scanner sc=new Scanner(System.in);
	  int arr[]= {100,180,260,310,40,535,695};
	  int arr1[]=new int[arr.length];
	  int arr2[]=new int[arr.length];
	  int day_buy[]=new int [arr.length];
	  int day_sell[]=new int [arr.length];
	  int temp1=1;
	  int m=0;
	  int n=0;
	  int y=0;
	  int z=0;
	  int count=0;
	  for(int i=0;i<arr.length-1;i++)
	  {
		  for(int j=i+1;j<=i+1;j++)
		  {
			
			  if(arr[i]<arr[j] && temp1==1)
			  {
				  arr1[m]=arr[i];
				  day_buy[y]=i;
				  y++;
				  m++;
				  temp1=0;
				  count++;
				  
			  }
			  arr2[n]=arr[j];
			  day_sell[z]=j;
			  if(arr[i]>arr[j] && temp1==0)
			  {
				 
				  
				  arr2[n]=arr[i];
				  n++;
				  temp1=1;
				  day_sell[z]=i;
				  z++;
			  }
			  
		  }
	  }
	  System.out.println(Arrays.toString(arr1));
	  System.out.println(Arrays.toString(arr2));
	  System.out.println(Arrays.toString(day_buy));
	  System.out.println(Arrays.toString(day_sell));
	  for(int i=0;i<count;i++)
	  {
		 
			  int profit=arr2[i]-arr1[i];
			  System.out.print("Buy on day "+day_buy[i]+" ");
			  System.out.println("sell  on day "+day_sell[i]+" profit is "+profit);
			  
		  
		  }
	  int max=0;
	  int store=0;
	  for(int i=0;i<count;i++)
	  {
		 int   max1=arr2[i]-arr1[i];
		 if(max<max1)
		 {
			 max=max1;
			 store=i;
		 }
		  }
	  
	  
	  
	  System.out.println("max profit is "+max +"Buy on day "+day_buy[store]+" "+"sell  on day "+day_sell[store]);
  }
}
