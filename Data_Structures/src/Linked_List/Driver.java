package Linked_List;

public class Driver {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(3);
		list.insert(10);
		list.insert(7);

		list.deleteAt(1);
		list.show();

	}
}
