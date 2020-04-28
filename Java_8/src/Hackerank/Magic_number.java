/*
 *         |2 7 6|
 * matrix= |9 5 1|
 *         |4 3 8|
 *         here addition of first row=15
 *              addition of second row=15
 *              addition of third row=15
 *              addition of first column=15
 *              addition of second column=15
 *              addition of third column=15
 *              diagonal addition is      =15
 *              here all are same so it is a magical number
 *               
 *               3*3
 *               only 8 magical number are persent 
 *               for 3*3 matrix
 *               
 *               formula
 *               constant=n((n*n+1)/2)
 *                        =3((3*3+1)/2)
 *                        =15
 *                        
 */
package Hackerank;

public class Magic_number 
{
     public static void main(String args[])
     {
    	 int arr[][]=new int[3][3];
    	 int i=1;
    	 int x=0;
    	 int y=0;
    	 int n=3;
    	 
    	 while(i<10)
    	 {
    		 if(i==1)
    		 {
    			 x=n/2;
    			 y=n-1;
    		 }
    		// else if()
    		 {
    			 
    		 }
    	 }
    	 
     }
}
