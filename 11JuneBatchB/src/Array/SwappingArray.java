package Array;

public class SwappingArray {

	public static void main(String[] args) {
		
		int a[] = {34,76,87,54,32,12};
		
		for(int i = 0; i<a.length;i++) {
			
			System.out.print(a[i]+ ",");   // 34,76,87,54,32,12
			
		}
		
		for(int i =0; i<a.length/2; i++) {
			
			int z;
		
			z = a[i];
			
			a[i] = a[(a.length-1)-i];
			
			a[(a.length-1)-i] = z;
		}
		
		System.out.println();
		
		System.out.println(a[0]);  //Print a[0] value   // 12
		
		for(int i = 0; i<a.length; i++) {
			
			System.out.print(a[i]+",");  // 12,32,54,87,76,34
		}

	}

}
