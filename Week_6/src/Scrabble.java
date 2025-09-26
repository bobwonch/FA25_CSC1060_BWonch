import java.util.Scanner;

public class Scrabble {

    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
	while(true)
	{
	    System.out.println("What tiles do you have?");
		String tiles = input.next();
		//tiles are anabbet
		if(tiles.charAt(0) == '0') 
		{
		    System.out.println("Goodbye.");
		    break;
		}
		System.out.println("What word do you want to spell?");
		String word = input.next();
		//word i abba;
		boolean can = canSpell(word, tiles);
		if(can)
		{
		    System.out.printf("You can spell %s.\n", word);
		}else
		{
		    System.out.printf("You can not spell %s.\n", word);
		}
		
	}
    }

    private static boolean canSpell(String word, String tiles) {
	for (int i = 0; i < word.length(); i++) {
	    int wordCount = 0;
	    for (int j = 0; j < word.length(); j++) {
		if(word.charAt(i) == word.charAt(j)) wordCount++;
	    }
	    int tileCount = 0;
	    for (int j = 0; j < tiles.length(); j++) {
		if(word.charAt(i) == tiles.charAt(j))tileCount++;
	    }
	    if(wordCount < tileCount)return false;
	}
	return true;
    }

}
