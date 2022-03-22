class Node
{
	int data;
	Node address;

	Node(int data)
	{
		this.data = data;
		this.address = null;
	}
}


class cLinkedlist
{
	Node start;

	void insertLast(int data)
	{
		Node newNode = new Node(data);
		if(start ==  null)
		{
			start = newNode;
			start.address = start;
			return;
		}

		Node temp = start;
		while(temp.address != start)
		{
			temp = temp.address;
		}

		temp.address = newNode;
		newNode.address = start;
	}

	void insertAtBeginning(int data)
	{
		Node newNode = new Node(data);
		if(start ==  null)
		{
			start = newNode;
			start.address = start;
			return;
		}

		Node temp = start;
		while(temp.address != start)
		{
			temp = temp.address;
		}

		temp.address = newNode;
		newNode.address = start;
		start = newNode;
	}

	void insertBefore(int data, int key)
	{
		if(start ==  null)
		{
			System.out.println("Sorry. linkedlist is empty");
			return;
		}
		Node newNode = new Node(data);
		if(start.data == key)
		{
			this.insertAtBeginning(data);
			return;
		}

		Node temp = start.address,previous = null;
		while(temp!= start)
		{
			if(temp.data == key)
				break;

			previous = temp;
			temp = temp.address;
		}


		if(temp == start)
		{
			System.out.println("Sorry. Not found");
			return;
		}

		previous.address = newNode;
		newNode.address = temp;

	}

	void insertAfter(int data, int key)
	{
		if(start ==  null)
		{
			System.out.println("Sorry. linkedlist is empty");
			return;
		}
	
		Node newNode = new Node(data);


		if(start.data == key)
		{
			newNode.address = start.address;
			start.address = newNode;
			return;
		}

		Node temp = start.address,previous = null;
		while(temp!= start)
		{
			if(temp.data == key)
				break;

			previous = temp;
			temp = temp.address;
		}


		if(temp == start)
		{
			System.out.println("Sorry. Not found");
			return;
		}

		if(temp.address == start)
		{
			temp.address = newNode;
			newNode.address = start;
		}
		else
		{
			newNode.address = temp.address;
			temp.address = newNode;
		}
	}

	void deleteFirst()
	{
		if(start ==  null)
		{
			System.out.println("Sorry. linkedlist is empty");
			return;
		}

		Node temp = start.address;
		while(temp.address!= start)
		{
			temp = temp.address;
		}

		start = start.address;
		temp.address = start;

	}

	void deleteLast()
	{
		if(start ==  null)
		{
			System.out.println("Sorry. linkedlist is empty");
			return;
		}

		Node temp = start.address;
		while(temp.address.address!= start)
		{
			temp = temp.address;
		}

		temp.address = start;

	}

	void delete(int key)
	{
		if(start ==  null)
		{
			System.out.println("Sorry. linkedlist is empty");
			return;
		}
	
		if(start.data == key)
		{
			this.deleteFirst();
			return;
		}

		Node temp = start.address,previous = start;
		while(temp!= start)
		{
			if(temp.data == key)
				break;
			previous = temp;
			temp = temp.address;
		}


		if(temp == start)
		{
			System.out.println("Sorry. Not found");
			return;
		}

		if(temp.address == start)
		{
			this.deleteLast();
		}
		else
		{
			previous.address = temp.address;
		}
	}
	void display()
	{
		if(start == null)
		{
			System.out.println("\nLinkedlist is empty\n");
			return;
		}

		System.out.println("\nElements of linkedlist->\n");
		System.out.print(start.data +" ");
		Node temp = start.address;
		while(temp != start)
		{
			System.out.print(temp.data +" ");
			temp = temp.address;
		}
	}
}

class circular_linkedlist
{
	public static void main(String[] args)
	{
		cLinkedlist l1 = new cLinkedlist();
		l1.insertLast(10);
		l1.insertLast(20);
		l1.insertLast(30);
		l1.insertLast(40);
		l1.insertLast(50);
		l1.insertLast(60);
		l1.display();
		/*l1.insertAtBeginning(5);
		l1.insertAtBeginning(0);*/

		//l1.insertBefore(4,60);
		//l1.insertAfter(4,20);
		//l1.deleteFirst();
		//l1.deleteLast();
		l1.delete(30);
		
		l1.display();

		
	}
}