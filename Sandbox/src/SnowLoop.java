import java.util.Scanner;
/**
 * This is an app to see how many people think
 * it will snow more than two feet;
 */
public class SnowLoop {

	public static void main(String[] args) {
		Scanner input;
		input = new Scanner(System.in);
		String line; // the full line of the input
		char answer; // yes or no about 2 feet of snow
		int numYes = 0; // number of people that respond yes
		int numNo = 0; // number of people that respond no
		int loopCounter; // number of people: times the loop is executed

		loopCounter = 0;
		answer = 'y';

		while (answer != 'q')
		{
			System.out.println(" Do you think we will get 2 feet of snow this winter? y/n\n");
			System.out.println(" Enter q to quit.");
			line = input.nextLine();
			line = line.toLowerCase();
			answer = line.charAt(0);

			if (answer == 'y') {
				numYes++;
			} else {
				numNo++;
			}
			loopCounter++;
		}
		System.out.println(" The number of yes responses = " + numYes);
		System.out.println(" The number of no responses = " + numNo);
		input.close();
	}
}
