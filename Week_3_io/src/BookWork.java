import java.util.Scanner;

public class BookWork {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	//this is how to get input. The name "input" is arbitrary	
		
		System.out.println("Type Something");
		String words = input.nextLine();//getting a String until the return is hit
		System.out.println(words);
		
		System.out.println("type one word");
		String word = input.next();//get up to the first whitespace/tab/return leaving the empty return in the buffer
		System.out.println(word);
		
		input.nextLine();// clears the new line/return in the buffer so we can use next() or nextInt(), etc.
		
		System.out.println("Type Something");
		String words2 = input.nextLine();
		System.out.println(words2);
		
		int inch;//variable can change
		double cm;
		final double CM_PER_INCH = 2.54;//constants that will not change in the program
		final int IN_PER_FOOT = 12;
		
		System.out.println("How many inches?");
		inch = input.nextInt();// getting an int
		cm = inch * CM_PER_INCH;
		
		System.out.printf("in = %d and cm = %.2f", inch, cm); //using printf %d for ints %.2f for floating
															  //point numbers the .2 means 2 spaces past the decimal point
		
		System.out.println(4.0/3.0);
		System.out.printf("Four thirds = %.3f" , 4.0/3.0);
		
		String num = "73";
		int iNum = 73;
		System.out.println(2 + Integer.parseInt(num));
		
		double pi = 3.1459;
		
		int x = (int) pi;
		
		System.out.println(x);
		
		int feet = 76/12;
		int inches = 76%12;
		int remainder;
		
		System.out.print("exactly how many cm?");
		cm = input.nextDouble();
		inches = (int)(cm/CM_PER_INCH);
		feet = inches/IN_PER_FOOT;
		remainder = inches % IN_PER_FOOT;
		System.out.printf("%.2f cm = %d ft, %d in \n", cm, feet, remainder);
		
		input.close();

	}
	// Most used printf flags: 
	// %d for whole numbers for spacing, you can add a number %4d means take up 4 spaces even if the number is smaller
	// %f or %.2f for floating point numbers
	// %s for strings
	// %c for characters
}
