import java.util.Scanner;

public class Methods {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("First line");
		newLine();
//		newLine();
//		newLine();
		System.out.println("Second line");
		threeLine();
		System.out.println("Third line");
		
		printTwice("Hello");
		
		printNTimes("Bob", 4);
		System.out.println("Barbara Anne");
		
		double root = Math.sqrt(17.0);
		System.out.printf("%.2f\n", root);
		
		System.out.println(Math.round(Math.toRadians(180.0)));
		
		String name = getName();
		System.out.println(name);
		
		//what is the radius
		//get input for radius
		//call the diameter method sending radius
		//call the area method using radius
		//call the circumference method

	}
	
	private static String getName() {
		System.out.println("Enter your full name");
		String name = input.nextLine();
		return name;
	}

	private static void printNTimes(String word, int num) {
		for(int i = 0; i < num; i++)
		{
			System.out.print(word + " ");
		}
		
	}

	private static void printTwice(String word) {
		System.out.println(word);
		System.out.println(word);
		
	}

	private static void threeLine() {
		System.out.println();
		System.out.println();
		System.out.println();
		
	}

	public static void newLine()
	{
		System.out.println();
	}
}
