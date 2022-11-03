package MethodConstructor;

public class ReturnType {
	
 static int test() {  //user define with int return
		
		int x= 5;
		int y = 15;
		int z = x+y;
		return z;
			
	}
	
	static String test1() {
		return "Welcome to Pune";
	}

	public static void main(String[] args) {
		
		int z = test();  //calling user define method
		String a = test1();
		
		System.out.println(z);
		System.out.println(a);
		
		
	}
}



