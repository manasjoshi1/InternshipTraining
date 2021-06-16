package Interface;

public class Interfaceimplement implements Printable, Showable {
	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}

	public static void main(String args[]) {
		Interfaceimplement obj = new Interfaceimplement();
		obj.print();
		obj.show();
	}
}
