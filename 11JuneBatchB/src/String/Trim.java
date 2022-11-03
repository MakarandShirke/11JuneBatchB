package String;

public class Trim {

	public static void main(String[] args) {
		
		String a = " Welcome to Java  ";
		
		System.out.println(a.length());  //Length before Trim
		
		String b = a.trim();
		
		System.out.println(b.length()); //Length after Trim
		
		System.out.println(b);

	}

}
