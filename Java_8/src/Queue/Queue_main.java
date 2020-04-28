package Queue;

public class Queue_main 
{
   public static void main(String args[])
   {
	   InQe q=new InQe();
	   
	   q.enqueue(5);
	   q.enqueue(6);
	   q.enqueue(7);
	   
	   System.out.println(q.dequeue());
	   System.out.println(q.dequeue());
	   System.out.println(q.dequeue());
   }
}
