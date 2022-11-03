package Encapsulation;

public class Demo2 extends Demo1 {
	
	public static void main(String[] args) {
		
		Demo1.set(100);
		
		Demo1 x = new Demo1();
		
		int y = x.get();   // x.get() for object to call variable & store value in y of variable "a"
		
		System.out.println(y);
	}

}
