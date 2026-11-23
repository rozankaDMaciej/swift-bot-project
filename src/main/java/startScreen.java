import java.util.Scanner;

public class startScreen {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome to Simon Swift!");
		System.out.println("-----------------------");
	System.out.println("Enter your name: ");
		
		String userName = userInput.nextLine();
		System.out.println("Hello " +userName +"! Press Enter to continue...");
		userInput.nextLine();
	}

}
