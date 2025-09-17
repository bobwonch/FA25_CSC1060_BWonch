import java.util.Scanner;

public class Loops {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		int num = 10;//initialization 
		while(num > 0)//condition
		{
			System.out.println(num);
			//num = num - 1;//changer
			num--;
		}
		System.out.println("Blast off!!");
		
		for(int i = 10; i > 0; i--)
		{
			System.out.println(i);
			
		}
		System.out.println("Blast off again!!!");
		
		System.out.println("Enter the number of rows");
		int rows = input.nextInt();
		System.out.println("Enter the number of cols");
		int cols = input.nextInt();
		
		for(int i = 1; i <= rows; i++)
		{
			for(int j = 1; j <= cols; j++)
			{
				System.out.printf("%4d", i * j);
			}
			System.out.println();
		}
		
		for(char c = 'A'; c <= 'Z'; c++)
		{
			System.out.print(c);
		}
		System.out.println("\nGreek Alphabet");
		for(int i = 913; i <= 937; i++)
		{
			System.out.print((char) i);
		}
		
	}

}
