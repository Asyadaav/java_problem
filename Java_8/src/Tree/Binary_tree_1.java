/*
 * #tree
 * 1.it is a non-linear data structure used for storing data
 * 2.it is made of nodes and edges without having any cycle
 * 3.each node in a tree can point to n numbers of nodes in a tree
 * 4.It is a way of representing hierarachical structure with a parent node called as root
 *   and many levels of additional nodes 
 *   
 *   
 * # Binary tree 
 * A tree is called as binary tree , if each node has zero,one or two children.
 * 
 *                        1
 *                      /  \
 *                     /    \
 *                    2      3
 *                   /\      /\
 *                  /  \    /  \
 *                 4    5  6    7
 *                 
 *    this is example of binary tree with pre-order traversal
 *    
 *    preorder=root  left  right
 *    inorder =left  root  right 
 *    postorder=left right root
  *                       9(root)
 *                      /       \
 *                     /         \
 *                    2           3
 *                   /\          /\
 *                  /  \        /  \
 *                 4   null   null  null  
 *                /\
 *               /  \
 *             null  null
 *             
 *  Ans of preorder is 9 2 4 3           
 *                 
 */
package Tree;

import java.util.Stack;

public class Binary_tree_1 
{
    
	private TreeNode root;
	
	private class TreeNode
	{
	  private TreeNode left;
	  private TreeNode right;
   	  private int data;   //Generic type
	
	   public TreeNode(int data)
	   {
		this.data=data;
	   }
	
	}
	
	public void createBinaryTree()
	{
		TreeNode first=new TreeNode(9);
		TreeNode second=new TreeNode(2);
		TreeNode third=new TreeNode(3);
		TreeNode fourth=new TreeNode(4);
		//TreeNode fifth=new TreeNode(5);
		
		
		root=first;
		first.left=second;
		first.right=third;
		second.left=fourth;
		//second.right=fifth;
		
	}
	
	
	//System.out.println("print a preOrder using recursion");
	
	
	public void preOrder(TreeNode root)
	{
		
		
		if(root==null)
		{
			return;
		}
		
		System.out.println(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	//System.out.println("print a preOrder using stack ");
	public void preOrder1()
	{
		if(root==null)
		{
			return;
		}
		
		Stack<TreeNode> stack= new  Stack<>();
		stack.push(root);
		//agar smjne me dikat ho to screenshot ya lecture dekhe ..ss lapy me avilable hai
		while(!stack.isEmpty())
		{
			TreeNode temp=stack.pop();
			System.out.println(temp.data +" ");
			if(temp.right!=null)
			{
				stack.push(temp.right);
			}
			if(temp.left!=null)
			{
				stack.push(temp.left);
			}
		}
		
		
	}
	
	//System.out.println("print a inOrder using recursion");
	 public void inOrder(TreeNode root)
	 {
		 if(root==null)
		 {
			 return;
		 }
		 
		 inOrder(root.left);
		 System.out.println(root.data +" ");
		 inOrder(root.right);
	 }
	
	// System.out.println("print a inOrder using stack");
	 public void inOrder1(TreeNode root)
	 {
		 if(root==null)
		 {
			return; 
		 }
		 
		 Stack<TreeNode> stack=new Stack<>();
		 TreeNode temp=root;
		 
		 while(!stack.isEmpty() || temp!=null)
		 {
			 if(temp!=null)
			 {
				 stack.push(temp);
				 temp=temp.left;
				 
			 }
			 else
			 {
				 temp=stack.pop();
				 System.out.println(temp.data +" ");
				 temp=temp.right;
			 }
		 }
	 }
	 
	 
	 //System.out.println("print a postOrder using recursion");
	 public void postOrder(TreeNode root)
	 {
		 if(root==null)
		 {
			 return;
		 }
		 postOrder(root.left);
		 postOrder(root.right);
		 System.out.println(root.data+" ");
		 
		 
	 }
	 
	
	public static void main(String args[])
	{
		Binary_tree_1 bt=new Binary_tree_1();
		bt.createBinaryTree();
		System.out.println("print a preOrder using recurtion ");
		bt.preOrder(bt.root);
		System.out.println("print a preOrder using stack ");
		bt.preOrder1();
		System.out.println("print a inOrder using recursion");
		bt.inOrder(bt.root);
		System.out.println("print a inOrder using stack");
		bt.inOrder1(bt.root);
		System.out.println("print a postOrder using recursion");
		bt.postOrder(bt.root);
		
	}
}
