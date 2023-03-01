package andre;

public class main {

	public static void main(String[] args) {
		
		printTopOrBottom(5);
		System.out.println("*   *");
		System.out.println("*   *");
		System.out.println("*   *");
		printTopOrBottom(5);
	}

	public static void printTopOrBottom(int size) {
		for (int i = 1; i < size; i++) {
			
			System.out.print("*");
		}
		
	}
}
