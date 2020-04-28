package Stack;

public class Persion_stack_main
{
	 public static void main(String args[])
	  {
		 Person person1=new Person("Ashutosh","123");
		 Person person2=new Person("Anju","123");

		 
		 
		 
		 PersonInStack stack =new PersonInStack();
		 stack.push(person1);
		 stack.push(person2);
		 
		 System.out.println(stack.pop().toString());
		 System.out.println(stack.pop().toString());
	  }
}
