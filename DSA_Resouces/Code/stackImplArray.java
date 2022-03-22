/*class Stack
{
	int stack[],top = -1, sizeOfStack;



	Stack(int size)
	{
		stack = new int[size];
		sizeOfStack = size;
	}
	void push(int value)
	{
		if(this.isFull())
		{
			System.out.println("\nOverflow\n");
			return;
		}

		top++;
		stack[top] = value;
		System.out.println("\n"+ value + " push in stack\n");
	}


	void pop()
	{
		if(this.isEmpty())
		{
			System.out.println("\nUnderFlow..\n");
			return;
		}
		int value = stack[top];
		top--;
		System.out.println("\n"+ value + " pop from stack\n");
	}

	void displayStack()
	{
		System.out.println("\nElements of linkedlist=>\n");
		for(int i = 0; i <= top; i++)
		{
				System.out.println(stack[i] + " ");
		}
	}

	boolean isFull()
	{
		if(top == (sizeOfStack - 1))
			return true;

		return false;
	}

	boolean isEmpty()
	{
		if(top == -1)
			return true;
		
		return false;
	}
}*/


public class stackImplArray
{
	int stack[],top = -1, sizeOfStack;



	stackImplArray(int size)
	{
		stack = new int[size];
		sizeOfStack = size;
	}
	void push(int value)
	{
		if(this.isFull())
		{
			System.out.println("\nOverflow\n");
			return;
		}

		stack[++top] = value;
		System.out.println("\n"+ value + " push in stack\n");
	}


	void pop()
	{
		if(this.isEmpty())
		{
			System.out.println("\nUnderFlow..\n");
			return;
		}
		int value = stack[top--];
		System.out.println("\n"+ value + " pop from stack\n");
	}

	void displayStack()
	{
		System.out.println("\nElements of linkedlist=>\n");
		for(int i = 0; i <= top; i++)
		{
				System.out.println(stack[i] + " ");
		}
	}

	boolean isFull()
	{
		if(top == (sizeOfStack - 1))
			return true;

		return false;
	}

	boolean isEmpty()
	{
		if(top == -1)
			return true;
		
		return false;
	}

	int peek()
	{
		if(isEmpty())
		{
			System.out.println("\n Stack is Empty.. \n");
			return 0;
		}

		int value = stack[top]
		return value;
	}
	public static void main(String args[])
	{
		stackImplArray stack = new stackImplArray(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);

		System.out.println("Peek of stack is " + stack.peek() + "\n");

		stack.push(50);
		stack.push(60);

		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();

		stack.displayStack();
	}
}