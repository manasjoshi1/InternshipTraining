package Stack_LinkedList;

public class Stack {
	StackNode head;

	public boolean isEmpty() {
		if (head == null)
			return true;
		else
			return false;
	}
	public void push(int data) {
		StackNode newNode = new StackNode(data);
		if(isEmpty()) {
			head=newNode;
		}
		else {
			StackNode tmp=head;
			head=newNode;
			newNode.next=tmp;
		}
		System.out.println(data+" pushed");
	}
	public void pop() {
		if(isEmpty()) {
			System.out.println("Empty Stack !underflow");
		}
		else {
			StackNode tmp=head;
			head=head.next;
			System.out.println(tmp.data+" popped");
		}
		
		
	}
	public void peek() {
		if(isEmpty()) {
			System.out.println("Empty Stack");
		}
		else {
			System.out.println(head.data);
		}
	}
}
