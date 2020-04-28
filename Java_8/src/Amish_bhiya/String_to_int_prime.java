package Amish_bhiya;

import java.util.Scanner;

public class String_to_int_prime 
{
   public static void main(String args[])
   {
	   Scanner sc =new Scanner(System.in);
	   System.out.println("enter a string");
	   String str=sc.nextLine();
	 
	  // System.out.println(num);
	   
	   int num=Integer.parseInt(str);
	  
	  

		   
		 
		   for(int j=1;j<num;j++)
      	   {
              
			   int flag=0;
		  // System.out.println(num);
	            if(j==1)
	            {
		        // System.out.println();
	             }
	            else
	            {
	            	 for(int i=2;i<j-1;i++)
		                {
			                       if(j%i==0)
			                     {
		                    		flag=1; 
			
			                       }
			   
		                   }
		               if(flag==0)
		  	         {
		  		   System.out.println(j);
		  	          }
	                }
	   
	         
	            //str1="";
	   }
   }
}
