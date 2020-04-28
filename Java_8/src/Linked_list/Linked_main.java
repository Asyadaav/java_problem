package Linked_list;

public interface Linked_main
{
    public static void main(String args[])
    {
    	InLinkedlist list=new InLinkedlist(2);
         list.insertItem(5);
         list.insertItem(7);
         list.printList();
         
         
         list.deleteItem(2);
         list.printList();
         
    }
}
