package inheritance;

//IS-A Relationship


class Animal{  
	Animal(){
		System.out.println("Animal Created...");
	}
void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
	Dog(){
		System.out.println("Dog Created...");
	}
void bark(){System.out.println("barking...");}  
void eat() {System.out.println("Only pedigree... ");}
}  
class BabyDog extends Dog{  
	BabyDog(){
		System.out.println("BabyDog Created...");
		
	}
void weep(){System.out.println("weeping...");}  
void eat() {System.out.println("Only Roti...");
super.eat();}
}  

public class Multilevel {
	public static void main(String args[]){  
		BabyDog d=new BabyDog();  
		d.eat();
		d.weep();  
		d.bark();  
		  
		}
}