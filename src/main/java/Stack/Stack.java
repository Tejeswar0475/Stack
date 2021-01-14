package Stack;

public class Stack {

	//Welcome to Stack program

	private final MyLinkedList myLinkedList;
	
	public Stack()
	{
		this.myLinkedList=new MyLinkedList();
	}
	
	public void push(INode myNode)
	{
		myLinkedList.add(myNode);
	}
	
	public void printStack()
	{
		myLinkedList.printMyNodes();
	}
	
	public INode peak()
	{
		return myLinkedList.head;
	}
}

