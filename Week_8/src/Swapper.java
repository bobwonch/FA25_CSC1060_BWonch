
public class Swapper {

    public static void main(String[] args) {
	int[] arr = {1,2,3,4,5,6,7,8,9};
	int i = 1;
	swap(arr, i, arr.length - (1 + i));
	
	for( int num : arr)
	{
	    System.out.print("" + num +", ");
	}

    }

    private static void swap(int[] arr, int i, int j) {
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;	
    }

}
