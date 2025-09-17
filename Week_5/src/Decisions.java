import java.util.Scanner;

public class Decisions {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int x =-10;
		// == 
		// != 
		// <=
		// >=
		
		if(x > 0)
		{
			System.out.println("X is Positive");
		}
		else
		{
			System.out.println("X is negative");
		}
		if(x % 2 == 0)//true part
		{
			System.out.println("X is even");
		}
		else//false part
		{
			System.out.println("X is odd");
		}
		
		int temp = 95;
		
		if(temp < 60)
		{
			System.out.println("Better wear a jacket and pants");
		}
		else if (temp < 70)
		{
			System.out.println("Probably just a jacket and shorts");
		}
		else if (temp < 80)
		{
			System.out.println("Shorts and a tee-shirt");
		}
		else
		{
			System.out.println("It's pretty hot, better just stay home!");
		}
		
		int age = 6;
		int height = 50;
		
		if(age >= 7)
		{
			System.out.print("You are old enough ");
			if(height < 50)
			{
				System.out.println("but, you are not tall enough");
			}else
			{
				System.out.println("and you are tall enough");
			}
		}else
		{
			System.out.println("You are not old enough!");
		}
		
		int weekday = 6;
		
		switch (weekday)
		{
			case 1:
				System.out.println("Sunday");
				break;
			case 2:
				System.out.println("Monday");
				break;
			case 3:
				System.out.println("Tuesday");
				break;
			case 4:
				System.out.println("Wednesday");
				break;
			case 5:
				System.out.println("Thursday");
				break;
			case 6:
				System.out.println("Friday");
				break;
			case 7:
				System.out.println("Saturday");
				break;
			default:
				System.out.println("That is not a valid weekday number");
		}
		
		if(age < 7 || height < 50)
		{
			System.out.println("You may ride the ride.");
		}
		else
		{
			System.out.println("Sorry, no dice!");
		}
		
		System.out.println("Enter a number");
		int num = input.nextInt();
		
		boolean isP = isPositive(num);
		if(isP)
		{
			System.out.println("Positive");
		}
		else
		{
			System.out.println("Negative");
		}
		
		
		System.out.println("Enter a number between 1 and 6");
		int num2 = input.nextInt();
		
		while(num2 > 6 || num2 < 1)
		{
			System.out.println("That is not between 1 and 6, try again");
			num2 = input.nextInt();
		}
		System.out.println("You entered " + num2);
	}
	private static boolean isPositive(int num) {
		
		return num >= 0;
	}
	


}
