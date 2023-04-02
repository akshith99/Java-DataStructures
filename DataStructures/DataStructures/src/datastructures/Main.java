package datastructures;

//This is just a sample program for testing the main method
public class Main {

	public static void main(String[] args) {

		System.out.println("Hello World");
		
//		System.out.println(addTwoNumbers(3, 4));
		
		printitems(10);
	}

	private static int addTwoNumbers(int i, int j) {

		return i + j;
	}
	
	public static void printitems(int n) {
		for(int i = 0; i<n; i++) {
			System.out.println(i);
		}
	}

}
