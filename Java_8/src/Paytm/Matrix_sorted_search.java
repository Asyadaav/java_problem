/*
 * \\10 20 30 40\\
 *  \\12 22 33 45\\
 *   \\14 24 44 47\\
 *    \\16 26 46 50\\........here we search 24 
 * 
 * 
 */
package Paytm;

import java.util.Scanner;

public class Matrix_sorted_search 
{
	public static void main(String args[])
	  {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter the size of row and column matrix ");
		  int length=sc.nextInt();
		  
		  int matrix[][]=new int[length][length];
		  System.out.println("enter the value in matrix");
		  for(int i=0;i<length;i++)
		  {
			  
			  for(int j=0;j<length;j++)
			  {
				  matrix[i][j]=sc.nextInt();
				  System.out.print(matrix[i][j]+" ");
			  }
			  System.out.println();
		  }
		  
		  
		  System.out.println("enter a number YOU want to search");
		  int number=sc.nextInt();
		  int i=0;
		  int j=length-1;
		  while(j>=0 && i<length)
		  {
			  if(matrix[i][j]==number)
			  {
				  System.out.println("search found at row "+(i+1)+" column "+(j+1));
				  break;
			  }
			  else if(number<matrix[i][j])
			  {
				  j--;
			  }
			  else
			  {
				 i++; 
			  }
		  }
		  
		  
	  }
}
