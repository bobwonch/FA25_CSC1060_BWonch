import java.util.Scanner;
public class ParkingLot
{
	static Scanner input;
	public static void main( String[ ] args )
	{
			int numCars;  //number of cars to sample
			int people;    //number of people in a car
			int carCount = 0;   //how many cars have already been sampled
			int totalPeople = 0;    //total number of people in sampled cars
			input = new Scanner(System.in);
			System.out.print( " You are going to count cars" );
			System.out.println( " as they enter the parking lot\n" );
			System.out.println( "How many cars are you required to sample?  " );
			numCars = input.nextInt( );

			while ( numCars > carCount )
			{
				carCount = carCount + 1;
				
				System.out.println( "How many people are in the car?" );
				people = input.nextInt( );
						/*accumulator for the total number of people in the car*/
				totalPeople = totalPeople + people;
			}

			float average;	//people per car
			average = totalPeople / numCars;
			System.out.println( "Average number of people per car:" + average );
			input.close ( );
	}
}
