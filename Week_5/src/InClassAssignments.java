import java.util.Scanner;

public class InClassAssignments {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter a number I can tell if it is positive.");
		int num = input.nextInt();
		if(isPositive(num))
		{
			System.out.println("Positive!");
		}else
		{
			System.out.println("Negative!");
		}
		System.out.println("Enter 3 number I will tell you which is greatest.");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		System.out.println(findBiggest(num1,num2,num3));
		
		System.out.println("Enter a number from 1 - 7 I will return the day");
		int dayNum = input.nextInt();
		String day = getDay(dayNum);
		System.out.println(day);
	}
	private static String getDay(int dayNum) {
		switch(dayNum)
		{
			case 1:
				return "Sunday";
			case 2:
				return "Monday";
			case 3:
				return "Tuesday";
			case 4:
				return "Wednesday";
			case 5:
				return "Thursday";
			case 6:
				return "Friday";
			case 7:
				return "Saturday";
	
		}
		return "Not a day number";
	}
	private static int findBiggest(int num1, int num2, int num3) {
		if(num2 > num1 && num2 > num3)return num2;
		if(num3 > num1 && num3 > num2)return num3;
		return num1;		
	}
	private static boolean isPositive(int num) {
		return num >= 0;
	}

}
