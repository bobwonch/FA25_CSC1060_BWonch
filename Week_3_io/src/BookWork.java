import java.util.Scanner;

public class BookWork {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		
		System.out.println("Type Something");
		String words = input.nextLine();
		System.out.println(words);
		
		System.out.println("type one word");
		String word = input.next();
		System.out.println(word);
		
		input.nextLine();
		
		System.out.println("Type Something");
		String words2 = input.nextLine();
		System.out.println(words2);
		
		int inch;
		double cm;
		final double CM_PER_INCH = 2.54;
		final int IN_PER_FOOT = 12;
		
		System.out.println("How many inces?");
		inch = input.nextInt();
		cm = inch * CM_PER_INCH;
		
		System.out.printf("in = %d and cm = %.2f", inch, cm);
		
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

	}

}
