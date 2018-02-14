/*
 *
 * Project: Week2 Exercise
 * Author:  Osbardo Rodriguez
 * Date:    2/13/18
 */
package week2_exercise;

/*
 * Import the Scanner java package.
 */
import java.util.Scanner;

/**
 * Define class Main.
 */
public class Main {

	public static void main(String[] args) {

		/*
		 * Instantiate the Scanner.
		 */
		Scanner input = new Scanner( System.in );

		/*
		 * Declare the all of the variables used in the class.
		 */
		int userVar = 0;
		int largest = 0;
		int smallest = 100;

		/*
		 * Let the user know what we'll be doing with their inputs.
		 */
		System.out.println( "Please enter positive numbers when asked to enter a number. To stop the program, enter -1." );

		while ( userVar != -1 ) {

			/*
			 * Get the user variable.
			 */
			System.out.print( "Please enter a positive number or -1 to end: " );
			userVar = input.nextInt();

			if ( userVar > largest ) {

				largest = userVar;

			}

			if ( userVar < smallest && userVar != -1 ) {

				smallest = userVar;

			}
		}

		if ( largest == 0 || smallest == 100 ) {

			System.out.println( "You didn't enter enough numbers!" );

		} else {

			System.out.println( "The largest number you entered was: " + largest );
			System.out.println( "The smallest number you entered was: " + smallest );

		}
	}
}
