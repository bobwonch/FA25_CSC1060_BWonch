
public class Bookwork {

	public static void main(String[] args) {
		countdown(10);
		System.out.println(factorial(5));
		for(int i = 0; i < 5; i++)
		{
			System.out.print(fibonacci(i) + ", ");
			if(i % 10 == 0) System.out.println();
		}
		System.out.println();
		displayBin(10);
		System.out.println();
		System.out.println(triangle(10));
		
	}
	
	private static int triangle(int i) {
		int sum = 0;
		for (int j = 0; j <= i; j++) {
			sum += j;						
		}
		return sum;
	}

	private static void displayBin(int i) {
		if(i > 0)
		{
			displayBin(i / 2);
			System.out.print(i % 2);
		}
		
	}

	public static int fibonacci(int n)
	{
		if(n == 0) return 0;
		if(n == 1 || n == 2) return 1;
		
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	public static int factorial(int n)
	{
		if(n == 0)
		{
			return 1;
		}
		int recurse = factorial(n - 1);
		int result = n * recurse;
		return result;
	}
	public static void countdown(int n)
	{
		if(n == 0)
		{
			System.out.println("Blastoff!!");	
		}
		else
		{ 
			
		    countdown(n - 1);
		    System.out.println(n);
		}
	}
}
