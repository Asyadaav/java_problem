/*
 * Data structure
 *                :-It is a container of data .It let us store data more efficiently .Eecution and main
 *                -ipulation of data becomes easy and fast with the help of data structres.it provides 
 *                bunch of ways to store a data
 */
package Stack;

public class Stack_main
{
  public static void main(String args[])
  {
	  InStack instack=new InStack();
	  
	  
	  
	  if(!instack.isFull())
	  {
		  instack.push(2);
		  instack.push(4);
		  instack.push(6);
		  instack.push(9);
		  instack.push(6);
		  instack.push(7);
		  instack.push(7);
		  instack.push(9);
	  }
	  
	  
	  System.out.println(instack.pop());
	  System.out.println(instack.pop());
	  System.out.println(instack.pop());
	  System.out.println(instack.pop());
	  System.out.println(instack.pop());
  }
}
