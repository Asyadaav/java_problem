/*
 * #Stack
 * 1.It is a linear data structure used for storing the data
 * 2.its an ordered list in which insertion and deletion are done at one end ,called as top
 * 3.The last element inserted is the first one to be deleted .Hense ,it is called as Last in First Out
 *    (LIFO) list.
 */
package Stack;

import java.util.EmptyStackException;
import java.util.Stack;

public class Steack_1_another 
{
   private ListNode top;
   private int length;
   
        private class ListNode
        {
	       private int data;
	       private ListNode next;
	       
	       
	       public ListNode(int data)
	       {
	    	   this.data=data;
	 
	       }
        } 
        
        public Steack_1_another()
        {
        	top=null;
        	length=0;
        }
        
        public int length()
        {
        	return length;
        }
        
        public boolean isEmpty()
        {
        	return length==0;
        }
        
        //push means stack me data ko dalna
        public void push(int data)
        {
        	ListNode temp=new ListNode(data);
        	temp.next=top;
        	top=temp;
        	length++;
        }
        
        
        //pop matlab stack se data ko nikalna
        public int pop()
        {
        	if(isEmpty())
        	{
        		throw new EmptyStackException();
        		
        	}
        	int result =top.data;
        	top=top.next;
        	length--;
        	return result;
        }
	
	
        //peek matlab stack ka sabse jo upper me data h woo show hone
        public int peek()
        {
        	if(isEmpty())
      	{
        		throw new EmptyStackException();
        	}
        	return top.data;
        }
        
        
	public static void main(String args[])
	{
		Steack_1_another stack=new Steack_1_another();
		
		
		stack.push(10);
		stack.push(11);
		stack.push(07);
		stack.push(05);
		
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		
	}
}
