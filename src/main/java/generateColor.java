import java.util.Random;

public class generateColor {

	//Generates a random colour from the 'colours' array
	public static void main(String[] args) {
		String[] colors = {"Blue" ,"Red" ,"Yellow" ,"Green"};

		Random randomizer = new Random();
		String randomColor = colors[randomizer.nextInt(colors.length)];

		System.out.println(randomColor);
	}

}
