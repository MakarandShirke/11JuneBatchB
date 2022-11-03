package Array;

public class DupicateElement {

	public static void main(String[] args) {
		
	int a[] = {23, 30, 25, 23, 25, 23}; // we need duplicate element count
	
	for(int i =0; i<a.length/2; i++) {
		int count =0;
		
	for(int j =0; j<a.length; j++) {
		
		if(a[i] == a[j]) {
			
			count++;
		}
			 
			
		}
	
	    System.out.println(a[i]+"is repeated ="+count);
	}
		
		

	}

}
