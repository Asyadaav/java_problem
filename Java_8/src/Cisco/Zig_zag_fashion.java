/*
 * Given an array of distinct elements, rearrange the elements of array in zig-zag fashion. The converted 
 * array should be in form a<b>c<d>e<f...
 * 
 * example:-
 * Input arr[]  ={4,3,7,8,6,2,1}   
 * output arr[]={3,7,4,8,2,6,1}   
 * 
 * 
 * Input arr[]  ={1,4,3,2}
 * output arr[]={1,4,2,3}
 */
package Cisco;

import java.util.Arrays;
import java.util.Scanner;

public class Zig_zag_fashion
{
  public static void main(String args[])
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the size of array");
	  int size=sc.nextInt();
	  System.out.println("enter the value in the array");
	  int arr[]=new int[size];
	  for(int i=0;i<size;i++)
	  {
		  arr[i]=sc.nextInt();
	  }
	  
	  //here you can also take a input from console
	 // int  arr[]  ={4,3,7,8,6,2,1};  //  {3,7,4,8,2,6,1}
	  int flag=0;
	  
	  
	  for(int i=0;i<arr.length-1;i++)
	  {
		if(flag==0)
		{
		if(arr[i]<arr[i+1] && flag==0)
		{
		}
		else
		{
			
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
			
		}
		}
		if(flag==1) 
		{
		if(arr[i]>arr[i+1] && flag==1)
		{
			
		}
		else
		{
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		}
			flag=1-flag;
			//System.out.println(flag);
		 
	  }
	  System.out.println(Arrays.toString(arr));
	  
  
}
}