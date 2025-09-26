import java.util.Scanner;

public class TimesTable {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of rows");
		int rows = input.nextInt();
		System.out.println("Enter the number of columns");
		int cols = input.nextInt();
		
		makeTable(rows, cols);	
		makeTriangle(rows);
		makeEquiTriangle(rows);
		

	}

	private static void makeEquiTriangle(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 0; j <= rows - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " " );
			}
			System.out.println();
		}
		
	}

	private static void makeTriangle(int rows) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%3d", j );
			}
			System.out.println();
		}
		
	}

	private static void makeTable(int rows, int cols) {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= cols; j++) {
				System.out.printf("%4d", j * i);
			}
			System.out.println();
		}
		
	}

}
