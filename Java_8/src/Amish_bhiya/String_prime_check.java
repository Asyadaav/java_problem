package Amish_bhiya;
import java.util.Scanner;
public class String_prime_check {


	
	
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
			            	 //  System.out.println(j);
			            	   String str1="";	   
			           str1=Integer.toString(j); 
			           
			           for(int i=0;i<str.length();i++)
			           {
			        	   //System.out.println(str1);
			        	   String str3="";
			        		str3=str3+	   str.charAt(i);
			        		
			        	   if(str1.equals(str3))
			        	   {
			        		 //  System.out.println("asdfghjasdfghjsdfghj");
			        		   System.out.println(str3);
			        	   }
			        	   for(int m=i+1;m<str.length();m++)
			        	   {
			        		   str3=str3+str.charAt(m);
			        		  // System.out.println(str3);
			        		   if(str1.equals(str3))
			        		   {
			        			  // System.out.println("hhhhhhhhhhhhhhhhhhhhh");
			        			   System.out.println(str1);
			        		   }
			        	   }
			           }
			            	   
			  		   System.out.println(j);
			  	          }
		                }
		   
		         
		            //str1="";
		   }
	   }
	}



