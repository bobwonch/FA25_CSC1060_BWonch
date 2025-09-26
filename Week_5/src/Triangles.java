import java.util.Scanner;

public class Triangles {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("How many rows?");
		int rows = input.nextInt();
		
		System.out.println("Enter a symbol");
		char symbol = input.next().charAt(0);
		
		for(int i = 1; i < rows + 1; i++)
		{
			for(int k = 0; k < rows - i; k++)
			{
				System.out.print(" ");
			}
			for (int j = 1; j < i + 1; j++) {
				System.out.print(symbol + " ");
			}
			System.out.println();
		}

	}

}
