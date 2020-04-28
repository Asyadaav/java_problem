package Stack;

public class PersonInStack
{

	
	  private Person[] stack;
      private int top;
      private int size;
      
      
      public PersonInStack()
      {
    	top=-1;
    	size=50;
    	stack =new Person[50];
    	
      }
      public PersonInStack(int size)
      {
    	top=-1;
    	this.size=size;
    	stack =new Person[this.size];
    	
      }
      
      
      
      public boolean push(Person item)
      {
    	  if(!isFull())
    	  {
    	  top++;
    	  stack[top]=item;
    	  return true;
    	  }
    	  else
    	  {
    		  return false;
    	  }
      }
      public Person pop()
      {
    	  return stack[top--];
      }
      
      
      public boolean isFull()
      {
    	  return (top==stack.length-1);
      }
      
}
