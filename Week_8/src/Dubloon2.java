
public class Dubloon2 {

    public static void main(String[] args) {
	boolean isDub = isDubloon("zAbballz");
	System.out.println(isDub);

    }

    private static boolean isDubloon(String s) {
	int[] counts = new int[26];
	String lower = s.toLowerCase();
	
	for(char letter : lower.toCharArray())
	{
	    int index = letter - 'a';
	    counts[index]++;
	}
	for(int c : counts)
	{
	    System.out.print("" + c + ", " );
	}
	for(int count : counts)
	{
	    if(count != 0 && count != 2)
	    {
		return false;
	    }
	}
	
	return true;
    }

}
