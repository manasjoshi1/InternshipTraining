package LinkedListChar;


class Driver
{
	static Node head; 

	class Node
	{
		char data;
		Node next;
		Node(char d)
		{
			data = d;
			next = null;
		}
	}


	void deleteKey(char key)
	{

		Node temp = head, prev = null;

		while (temp != null && temp.data == key)
		{
			head = temp.next; 
			temp = head; 
		}

		while (temp != null)
		{
			
			
			while (temp != null && temp.data != key)
			{
				prev = temp;
				temp = temp.next;
			}

			
			if (temp == null)
				return;

			prev.next = temp.next;

			temp = prev.next;
		}
	}

	public void insert(char new_data)
	{
		Node new_node = new Node(new_data);
		if(head==null)
			head=new_node;
		else {
			Node tmp=head;
			while(tmp.next!=null) {
				tmp=tmp.next;
			}
			tmp.next=new_node;}
//		new_node.next = head;
//		head = new_node;}
	}

	public void printList()
	{
		Node tnode = head;
		while (tnode != null)
		{
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}
	}

	// Driver Code
	public static void main(String[] args)
	{
		Driver l = new Driver();

		l.insert('a');
		l.insert('a');
		l.insert('a');
		l.insert('b');
		l.insert('c');
		l.insert('a');
		l.insert('a');
		l.insert('d');

		char key = 'a' ;
		System.out.println("Created Linked list is:");
		l.printList();

				l.deleteKey(key);

		System.out.println(
			"\nLinked List after Deletion is:");
		l.printList();
	}
}

