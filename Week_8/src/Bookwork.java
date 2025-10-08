import java.util.Random;

public class Bookwork {

	public static void main(String[] args) {
		int[] counts;
		double[] values;
		
		counts = new int[10];
		
		int[] otherCounts = new int[4];
		
		values = new double[10];
		String poem = "The quick brown fox jumps over the lazy dog";
		
		String[] words = poem.split(" ");
		
		int[] arr = {1,2,3,4,5,6,7,8};
		
		System.out.println(counts[1]);
		System.out.println(words[2]);
		System.out.println(arr[3]);
		System.out.println(arr);
		
		//abracadabra
		
		System.out.println("Other Counts at 2 is " + otherCounts[2]);
//		for(int i = 0; i < counts.length; i++)
//		{
//			
//			System.out.println(counts[i]);
//		}
		
		//printArray(arr);
		//printArray(words);
		for(int i = 0; i < counts.length; i++)
		{
			counts[i] = i;
		}
		//copyArrays(counts, otherCounts);
		System.out.println("Other Counts at 2 is " + otherCounts[2]);
		int index = search(arr, 5);
		System.out.println("Five is located at index " + index);
		
		fillArray(counts);
		printArray(counts);
		System.out.println();
		for(int num : counts)
		{
			System.out.println(num);
		}
		
	}

	private static void fillArray(int[] counts) {
		Random rand = new Random();
		for (int i = 0; i < counts.length; i++) {
			counts[i] = rand.nextInt(100) + 1;
		}
		
	}

	private static int search(int[] arr, int target) {
		for (int j = 0; j < arr.length; j++) {
			if(arr[j] == target) return j;
		}
		return -1;
	}

	private static void copyArrays(int[] counts, int[] otherCounts) {
		for(int i = 0; i < counts.length; i++)
		{
			otherCounts[i] = counts[i];
		}
		
	}

	private static void printArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int i = 0; i < arr.length; i++)
		{
			
			System.out.print(arr[i] + " ");
			if(i == 4)System.out.println();
		}
	}

}
