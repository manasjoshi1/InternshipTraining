package Linked_List;

public class LinkedList {

	Node head;
	public void insert(int data) {
		Node n =new Node();
		n.data=data;
		n.next=null;
		if(head==null) {
			head= n;
		}
		else {
			Node tmp=head;
			while(tmp.next!=null) {
				tmp=tmp.next;
			}
			tmp.next=n;
		}
		
		
	}
	public void insertHead(int data) {
		Node n = new Node();
		n.data= data;
		n.next=null;
		n.next=head;
		head= n;
	}
	public void deleteAt(int pos) {
		Node tmp=head;
		for(int i=0;i<pos-1;i++) {
			
			tmp=tmp.next;
			
		}
		Node n =tmp.next.next;
		tmp.next=n;
		
	}
	public void show() {
		Node tmp =head;
		while(tmp!=null) {
			System.out.println(tmp.data);
			tmp=tmp.next;
		}
	}

	

}
