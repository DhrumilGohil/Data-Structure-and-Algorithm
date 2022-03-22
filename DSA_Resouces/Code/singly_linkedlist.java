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


class Linkedlist
{
	Node start = null;

	void insertLast(int data)
	{
		Node newNode = new Node(data);
		if(start == null)
		{
			start = newNode;
			System.out.println(data + " is added to linkedlist\n");
			return;
		}

		Node temp = start;
		while(temp.address !=  null)
		{
			temp = temp.address;
		}

		temp.address = newNode;
		System.out.println(data + " is added to linkedlist\n");
	}

	void insertBeginning(int data)
	{
		Node newNode = new Node(data);
		if(start == null)
		{
			start = newNode;
			System.out.println(data + " is added to linkedlist\n");
			return;
		}

		newNode.address = start;
		start = newNode;

	}

	void insertBefore(int data, int key)
	{
		Node newNode = new Node(data);
		if(start == null)
		{
			System.out.println("Sorry.No Elements in Linkedlist");
			return;
		}

		if(start.data == key)
		{
			newNode.address = start;
			start = newNode;
			return;
		}

		Node temp,previous = null;
		temp = start;
		while(temp != null)
		{
			if(temp.data == key)
				break;
			previous = temp;
			temp = temp.address;
		}

		if(temp == null)
		{
			System.out.println("\n Sorry!, No key Found\n");
			return;
		}
		previous.address = newNode;
		newNode.address = temp;


	}

	void insertAfter(int data, int key)
	{
		Node newNode = new Node(data);
		if(start == null)
		{
			System.out.println("Sorry.No Elements in Linkedlist");
			return;
		}


		Node temp;
		temp = start;
		while(temp != null)
		{
			if(temp.data == key)
				break;
			temp = temp.address;
		}

		if(temp == null)
		{
			System.out.println("\n Sorry!, No key Found\n");
			return;
		}
		newNode.address = temp.address;
		temp.address = newNode;

	}

	void deleteFirst()
	{
		if(start == null)
		{
			System.out.println("Sorry.No Elements in Linkedlist");
			return;
		}

		start = start.address;
	}

	void deleteLast()
	{
		if(start == null)
		{
			System.out.println("Sorry.No Elements in Linkedlist");
			return;
		}

		Node temp = start;
		while(temp.address.address != null)
		{
			temp = temp.address;
		}

		temp.address = null;
	}

	void deleteNode(int key)
	{
		if(start == null)
		{
			System.out.println("Sorry.No Elements in Linkedlist");
			return;
		}

		if(start.data == key)
		{
			this.deleteFirst();
			return;
		}
		Node temp = start,previous = null;
		while(temp!= null)
		{
			if(temp.data == key)
				break;
			previous = temp;
			temp = temp.address;
		}

		if(temp == null)
		{
			System.out.println("\n Sorry!, No key Found\n");
			return;
		}

		previous.address = temp.address;



	}

	void beforePosition(int data,int pos)
	{
		if(start == null)
		{
			System.out.println("Sorry.No Elements in Linkedlist");
			return;
		}

		if(pos < 0)
		{
			System.out.println("Invalid Position");
			return;
		}

		int cnt = 1;
		Node temp = start;
		while(cnt < pos)
		{
			cnt++;
			temp = temp.address;
		}

		this.insertBefore(data,temp.data);
	}

	void afterPosition(int data,int pos)
	{
		if(start == null)
		{
			System.out.println("Sorry.No Elements in Linkedlist");
			return;
		}

		if(pos < 0)
		{
			System.out.println("Invalid Position");
			return;
		}

		int cnt = 1;
		Node temp = start;
		while(cnt < pos)
		{
			cnt++;
			temp = temp.address;
		}

		this.insertAfter(data,temp.data);
	}
	void display()
	{
		if(start == null)
		{
			System.out.println("Sorry.No Elements in Linkedlist");
			return;
		}

		if(start != null)
		{
				System.out.println("\n Elements of linkedlist\n");
				Node temp = start;
				while(temp != null)
				{
					System.out.print(temp.data+" ");
					temp = temp.address;
				}
		}

	}
}



public class singly_linkedlist
{
	public static void main(String[] args)
	{
		Linkedlist l1 = new Linkedlist();
		l1.insertLast(10);
		l1.insertLast(40);
		l1.insertLast(20);
		l1.insertLast(30);
		l1.insertLast(50);
		l1.insertLast(60);

		l1.insertBeginning(5);
		l1.insertBeginning(2);
		l1.insertBeginning(3);
		l1.insertBeginning(4);

	//	l1.insertBefore(45,10);
	//	l1.insertAfter(55,60);
		l1.display();
	//	l1.deleteFirst();
		/*l1.deleteLast();
		l1.deleteNode(45);*/
		//l1.beforePosition(100,4);
		l1.afterPosition(100,4);
		
		l1.display();
	}
}