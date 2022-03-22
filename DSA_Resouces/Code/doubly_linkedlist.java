class Node
{
	int data;
	Node left,right;

	Node(int data)
	{
			this.data = data;
			this.left = null;
			this.right = null;
	}
}


class dLinkedlist
{
	Node start = null;

	void insertLast(int data)
	{
		Node newNode = new Node(data);

		if(start == null)
		{
			start = newNode;
			return;
		}

		Node temp = start,previous = null;
		while(temp.right != null)
		{
			previous = temp;
			temp = temp.right;
		}

		temp.right = newNode;
		temp.left = previous;
	}

	void insertAtBeginning(int data)
	{
		Node newNode = new Node(data);

		if(start == null)
		{
			start = newNode;
			return;
		}

		start.left = newNode;
		newNode.right = start;
		start = newNode;

	}

	void insertBefore(int data, int key)
	{
		Node newNode = new Node(data);

		if(start == null)
		{
			System.out.println("\nSorry. Linkedlist is empty\n");
			return;
		}

		if(start.data == key)
		{
			insertAtBeginning(data);
			return;
		}

		Node temp = start,previous = null;
		while(temp != null)
		{
			if(temp.data == key)
				break;
			previous = temp;
			temp = temp.right;
		}

		if(temp == null)
		{
			System.out.println("\nSorry. Not Found\n");
			return;
		}
		previous.right = newNode;
		newNode.left = previous;
		newNode.right = temp;
		temp.left = newNode;
	}

	void insertAfter(int data, int key)
	{
		Node newNode = new Node(data);

		if(start == null)
		{
			System.out.println("\nSorry. Linkedlist is empty\n");
			return;
		}

		Node temp = start,previous = null;
		while(temp != null)
		{
			if(temp.data == key)
				break;
			previous = temp;
			temp = temp.right;
		}

		if(temp == null)
		{
			System.out.println("\nSorry. Not Found\n");
			return;
		}
		newNode.right = temp.right;
		temp.right = newNode;
		newNode.left = temp;
	}

	void deleteFirst()
	{
		if(start == null)
		{
			System.out.println("\nSorry. Linkedlist is empty\n");
			return;
		}
		start = start.right;
		start.left = null;
	}

	void deleteLast()
	{
		if(start == null)
		{
			System.out.println("\nSorry. Linkedlist is empty\n");
			return;
		}

		Node temp = start,previous = null;
		while(temp.right != null)
		{
			previous = temp;
			temp = temp.right;
		}

		previous.right = null;
	}

	void delete(int data)
	{
		if(start == null)
		{
			System.out.println("\nSorry. Linkedlist is empty\n");
			return;
		}

		Node temp = start,previous = null;
		while(temp != null)
		{
			if(temp.data == data)
				break;
			previous = temp;
			temp = temp.right;
		}

		if(temp == null)
		{
			System.out.println("\nSorry. Not Found\n");
			return;
		}

		previous.right = temp.right;
		temp.right.left = previous;
	}
	void display()
	{
		System.out.println("\nElements of linkedlist\n");
		Node temp = start;
		while(temp != null)
		{
			System.out.println(temp.data + " ");
			temp = temp.right;
		}
	}
}


class doubly_linkedlist
{
	public static void main(String[] args)
	{
		dLinkedlist l1 = new dLinkedlist();
		l1.insertLast(10);
		l1.insertLast(20);
		l1.insertLast(30);
		l1.insertLast(40);
		l1.insertLast(50);
		l1.insertLast(60);

		l1.insertAtBeginning(5);
		l1.insertAtBeginning(1);
		
		l1.display();

		l1.insertBefore(1,60);
		l1.insertAfter(1,90);
		l1.deleteFirst();
		l1.deleteLast();
		l1.delete(10);

		l1.display();
	}
}