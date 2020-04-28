/*
 * input like a array {3,6,20,6,15,2,1,7}
 * output will be     {20,20,20,15,15,7,7,7}
 */
package Cisco;

import java.util.Arrays;
import java.util.Scanner;

public class Next_gratest_element_in_array 
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of array");
	int length=sc.nextInt();
	System.out.println("enter the value in the array");
	int arr[]=new int[length];
	for(int i=0;i<length;i++)
	{
		arr[i]=sc.nextInt();
	}
	int max_array_from_right=arr[length-1];
	for(int i=length-2;i>=0;i--)
	{
		if(max_array_from_right>arr[i])
		{
			arr[i]=max_array_from_right;
		}
		else
		{
			max_array_from_right=arr[i];
		}
	}
	System.out.println(Arrays.toString(arr));
}
}
