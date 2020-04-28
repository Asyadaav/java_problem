/*
 * enque:- means enter the value in queue 
 * dequeue:- means pop the value from queue
 * 
 * 
 *            front->{2,4,6}<-rear
 */

package Queue;

public class InQe
{
     private int q[];
     private int size;
     private int total;
     private int front;
     private int rear;
     
     
     public InQe()
     {
    	 size=100;
    	 total=0;
    	 front=0;
    	 rear=0;
    	 q=new int[size];
     }
     public InQe(int size)
     {
    	this.size=size;
    	 total=0;
    	 front=0;
    	 rear=0;
    	 q=new int[this.size]; 
     }
     
     
     
     public boolean enqueue(int item)
     {
    	 if(isFull())
    	 {
    		 return false;
    	 }
    	 else
    	 {
    		 total++;
    		 q[rear]=item;
    		 rear++;
    		 return true;
    	 }
     }
     public int dequeue()
     {
    	 int item=q[front];
    	 total--;
    	 front++;
    	 return item;
     }
     
     public boolean isFull()
     {
    	 if(size == total)
    	 {
    		 return true;
    	 }
    	 else
    	 {
    		 return false;
    	 }
     }
	
     
     
    
     
}
