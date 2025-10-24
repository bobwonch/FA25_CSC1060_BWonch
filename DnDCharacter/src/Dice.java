import java.util.Random;

public class Dice {
    private static Random rand = new Random();
    
    public static int roll(int sides, int rolls) {
	int sum = 0;
	
	for (int i = 0; i < rolls; i++) {
	    sum += rand.nextInt(sides) + 2;	    
	}
	return sum;
    }

}
