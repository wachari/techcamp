package basics;

public class Test {

	public static void main(String[] args) {
		//for loop for sheep
		/**
		 * sheep=50,
		 * goat=30;
		 */
		
		sheep();
	}
	private static void sheep() {
		int x=0;
		int sheep=50;
		for(int goat=30; x <=goat;x++) {
			
			if ((x%2)==0) {
				sheep=sheep+3;
				
			}
		else {
				System.out.println("number of sheep"+sheep);
			}
				
			
			
		}
		
	}

}
