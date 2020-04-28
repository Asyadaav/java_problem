package Paytm;

import java.util.Scanner;

public class Matrix_diagonal_print
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
	
	  
	  
	  for(int k=0;k<length;k++)
	  {
		  int i=k;
		  int j=0;
		 while(j<length && i>=0) 
		 {
			System.out.print(matrix[i][j]+" ");
			i=i-1;
			j=j+1;
		 }
		 System.out.println();
	  }
	  
	  
	  for(int k=1;k<length;k++)
	  {
		  int i=length-1;
		  int j=k;
		  while(j<length && i>=1) 
			 {
			  System.out.print(matrix[i][j]+" ");
				i=i-1;
				j=j+1;
				
			 }
		  System.out.println();
		  
	  }
  }
}
