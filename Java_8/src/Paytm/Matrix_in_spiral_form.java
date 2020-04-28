
/*
 * given a 2d matrix array print in spiral form
 * input:
 * 1  2   3   4 
 * 5  6   7   8 
 * 9  10  11  12
 * 13 14  15  16
 * output:-
 * 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
 * 
 * 1 2 3 4 5 6 
 * 7 8 9 10 11 12
 * 13 14 15 16 17 18
 * output
  1
2
3
4
5
6
12
19
18
16
15
14
13
7
8
9
10
11
 */

package Paytm;

import java.util.Scanner;

public class Matrix_in_spiral_form 
{
	 public static void main(String args[])
	   {
		   Scanner sc=new Scanner(System.in);
		   System.out.println("enter row and column of a matrix");
		   int row=sc.nextInt();
		   int col=sc.nextInt();
		   int a[][]=new int[row][col];
		   System.out.println("enter the value in the matrix");
		
		   for(int i=0;i<row;i++)
		   {
			   for(int j=0;j<col;j++)
			   {
				   a[i][j]=sc.nextInt();
			   }
		   }
		   
		   for(int i=0;i<row;i++)
		   {
			   for(int j=0;j<col;j++)
			   {
				System.out.print( a[i][j]+"  ");
			   }
			   System.out.println();
		   }
		   /*
		    * k=starting row index
		    * m=ending row index
		    * l=starting column index
		    * n=ending column index
		    * i=iterator
		    */
		   
		  int k=0;
		  int m=row-1;    //3-1=2
		  int l=0;
		  int n=col-1;    //6-1=5
		  
		  
		  
		  while(k<=m && l<=n)              //k=0;m=2     
		  {                                //l=0;n=5
			  for(int i=l;i<=n;i++)
			  {
				  System.out.println(a[k][i]);//1 2 3 4 5 6      //8,9,10,11
				                              //
				  
			  }
			  k++;                         //k=1
			                              
			  for(int i=k;i<=m;i++)            //i=1;m=2;n=5
			  {
				  System.out.println(a[i][n]);    //12,19
			  }
			  n--;                 //n=4    
			  
			  if(k<m)                   //k=1;m=2
			  {
				  
				  for(int i=n-l;i>=0;--i)        //l=0
				  {
					  System.out.println(a[m-l][i]);    //18,16,15,14,13
				  }
				  m--;
				                                        //m=1
			  }
			  
			  if(l<n)                 //l=0;m=1
			  {
				  
				  for(int i=m-l;i>=k;--i)             //k=1;l=0
				  {
					  System.out.println(a[i][l]);     //7
				  }
				  l++;
				 
				 				  
				  //l=1
			  }
		  }
		  
	   }
}
