/*Class Queue
{
	int rear,front,queue[],queueSize;

	Queue(int size)
	{
		this.queue = new int[size];
		rear = 0;
		front = 0;
		queueSize = size;
	}

	void enQueue(int value)
	{
		if(isFull())
		{
			System.out,println("\nOverflow...\n");
			return;
		}

		if(front > rear)
			front = rear = -1;

		front = 0;
		rear++;
		queue[rear] = value;

		System.out.println("\n" + value + " enqueue in queue\n");
	}

	void deQueue()
	{
		if(isEmpty())
		{
			System.out,println("\nUnderflow...\n");
			return;
		}

		int value = queue[front];
		front++;
		System.out.println("\n" + value + " dequeue in queue\n");
	}
	boolean isFull()
	{
		if(rear == queueSize)
			return true;

		return false;
	}

	boolean isEmpty()
	{
		if(front == -1)
			return true;

		return false;
	}

}

*/

class queueImplArray
{
	int rear,front,queue[],queueSize;

	queueImplArray(int size)
	{
		this.queue = new int[size];
		rear = -1;
		front = -1;
		queueSize = size;
	}

	void enQueue(int value)
	{
		if(isFull())
		{
			System.out.println("\nOverflow...\n");
			return;
		}

		front = 0;
		rear++;
		queue[rear] = value;

		System.out.println("\n" + value + " enqueue in queue\n");
	}

	void deQueue()
	{
		if(isEmpty())
		{
			System.out.println("\nUnderflow...\n");
			return;
		}

		int value = queue[front];
		front++;
		System.out.println("\n" + value + " dequeue in queue\n");
	}
	boolean isFull()
	{
		if(rear == (queueSize - 1))
			return true;

		return false;
	}

	boolean isEmpty()
	{
		if(front == -1 || front > rear)
			return true;

		return false;
	}

	int peek()
	{
		if(front == -1)
		{
			System.out.println("\n Queue is Empty.. \n");
			return 0;
		}

		return queue[front];
	}
	public static void main(String args[])
	{
		queueImplArray queue = new queueImplArray(5);
		queue.enQueue(10);
		queue.enQueue(20);
		queue.enQueue(30);
		queue.enQueue(40);
		queue.enQueue(50);
		//queue.enQueue(60);

		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();
		queue.deQueue();

		//queue.enQueue(10);
	}
}