import java.util.Scanner;

public class Sand {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a temp in F:");
		double fTemp = input.nextDouble();
		double cTemp = (fTemp - 32) * 5/9;
		double kTemp = cTemp + 273.15;		
		System.out.printf("%.3f°F is %.3f°C and %.2f°K", fTemp, cTemp, kTemp);
		

	}

}
