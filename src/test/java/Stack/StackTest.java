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
		stack.printStack();
		INode peak=stack.peak();
		assertEquals(thirdNode,peak);
		
	}

	
}
