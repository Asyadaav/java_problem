package Cisco;

import java.util.Arrays;
import java.util.Scanner;

public class Pair_of_sum_in_array 
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
		System.out.println("enter the number you want search with will result of add pair");
		
		int search=sc.nextInt();
		System.out.println("here we perform sorting of an array");
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int left=0;
		int pair=0;
		int right=length-1;
		while(left<right)
		{
			if((arr[left]+arr[right])>search)
			{
				--right;
				System.out.println("1");
			}
			else if((arr[left]+arr[right])<search)
			{
				++left;
				System.out.println("2");
			}
			else
			{
				
				if((arr[left]+arr[right])==search)
				{
				pair++;
				}
				left++;
				right--;
			}
		}
		if(pair!=0)
		{
		System.out.println(pair+" pair found ");
		}
		else
		{
          System.out.println("pair is not found");
		}
	}
}
