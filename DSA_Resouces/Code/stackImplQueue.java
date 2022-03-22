Class Queue
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



class stackImplQueue
{
	public static void main(String args[])
	{
		Queue queue = new Queue(5);
		queue.enqueue(10);
	}
}