package String;

public class Split {

	public static void main(String[] args) {
		
		String s2 = "Makarand Shirke";
		
		String[] a = s2.split(" ");
		
		for(int i =0; i<=a.length-1; i++) {
			
			System.out.println(a[i]);
		}
		
		System.out.println(a.length);

	}

}
