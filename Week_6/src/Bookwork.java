import java.util.Scanner;

public class Bookwork {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		String fruit = "banana";
		
		for(int i = 0; i < fruit.length(); i++)
		{
			System.out.println(fruit.charAt(i));
		}
		
		char first = fruit.charAt(0);
		char last = fruit.charAt(fruit.length()-1);
		
		String firstHalf = fruit.substring(0, fruit.length()/2);
		String lastHalf = fruit.substring(fruit.length()/2);
		
		System.out.printf("%s, %s, %s, %s%n",first, last, lastHalf, firstHalf);
		
		int index = fruit.indexOf("nan");
		System.out.println(index);
		
		System.out.println("Enter a word");
		String word = input.next();
		if(word.equals("hello"))
		{
			System.out.println("You got it!");
		}else
		{
			System.out.println("Wah wah wah...");
		}
		
		String lady = "Ada Lovelace";
		String man = "Ada Lovelace";
		if(lady.compareTo(man)<0)
		{
			System.out.println(lady);
		}else
		{
			System.out.println(man);
		}
		System.out.println(man.compareTo(lady));
		
		String newWord = String.format("%s %s %s", man, lady, word);
		System.out.println(newWord);
	}

}
