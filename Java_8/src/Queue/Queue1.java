package Queue;

import java.util.NoSuchElementException;

public class Queue1 {

	
	private ListNode front;
	private ListNode rear;
	private int length;
	
	public Queue1()
	{
		this.front=null;
		this.rear=null;
	}
	
	private class ListNode
	{
		private int data;
		private ListNode next;
		
		
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}
		
	}	
		
		public int length()
		{
			return length;
		}
		
		public boolean isEmpty()
		{
			return length==0;
		}
		
		public void enqueue(int data)
		{
			ListNode temp=new ListNode(data);
			if(isEmpty())
			{
				front=temp;
			}
			else
			{
				rear.next=temp;
			}
			rear=temp;
			length++;
		}
		
		public void print()
		{
			if(isEmpty())
			{
				return;
			}
			
			ListNode current=front;
			while(current != null)
			{
				System.out.print(current.data+ "-->");
				current=current.next;
			}
			System.out.println("null");
		}
		
		public int dequeue()
		{
			if(isEmpty())
			{
				throw new NoSuchElementException("Queue is already empty");
			}
			
			int result=front.data;
			front=front.next;
			if(front==null)
			{
				rear=null;
			}
			length--;
			return result;
		}
		
		
		
		//for first element of queue
		//10  7  5
		//here 10 is first element
		public int first() 
		{
			if(isEmpty())
			{
				throw new NoSuchElementException("Queue is already empty");
			}
			return front.data;
		}
		
	  

		//for first element of queue
		//10  7  5
		//here 5 is last element
		public int last()
		{
			if(isEmpty())
			{
				throw new NoSuchElementException("Queue is already empty");
			}
			return rear.data;
		}
	
	
	
	
	public static void main(String[] args)
	{
            Queue1 queue =new Queue1();
            queue.enqueue(10);
            queue.enqueue(07);
            queue.enqueue(05);
            queue.print();
            
            
            queue.dequeue();
            queue.print();
            
           System.out.println(queue.first());
           System.out.println(queue.last());
            
	}

}
