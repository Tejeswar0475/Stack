package Stack;

import static org.junit.Assert.*;

import org.junit.Test;

public class StackTest {

	@Test
	public void AddingOfThreeNumbers()
	{
		MyNode<Integer> firstNode=new MyNode<>(70);
		MyNode<Integer> secondNode=new MyNode<>(30);
		MyNode<Integer> thirdNode=new MyNode<>(56);
		Stack stack=new Stack();
		stack.push(firstNode);
		stack.push(secondNode);
		stack.push(thirdNode);
		INode peak=stack.peak();
		assertEquals(thirdNode,peak);	
	}
	
	
	@Test
	public void AddingOfThreeNumbersPopTest()
	{
		MyNode<Integer> firstNode=new MyNode<>(70);
		MyNode<Integer> secondNode=new MyNode<>(30);
		MyNode<Integer> thirdNode=new MyNode<>(56);
		Stack stack=new Stack();
		stack.push(firstNode);
		stack.push(secondNode);
		stack.push(thirdNode);		
		INode pop=stack.pop();
		stack.printStack();
		assertEquals(thirdNode,pop);
	}	
}
