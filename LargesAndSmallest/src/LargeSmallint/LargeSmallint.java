package LargeSmallint;

import java.util.Scanner;

public class LargeSmallint {

	public static void main(String[] args) {
		// create Scanner to obtain input from command window
		Scanner input = new Scanner(System.in);
		
		// initialize variables
		int num1;	// first integer for user input
		int num2;	// second integer for user input
		int num3;	// third integer for user input
		int num4;	// fourth integer for user input
		int num5;	// fifth integer for user input
		int smallest;	// store smallest integer
		int largest;	// store largest integer
		
		System.out.print("Enter first integer: ");	// prompt
		num1 = input.nextInt(); // read first integer from user
		
		System.out.print("Enter second integer: ");	// prompt
		num2 = input.nextInt();	// read second integer from user
		
		System.out.print("Enter third integer: ");	// prompt
		num3 = input.nextInt();	// read third integer from user
		
		System.out.print("Enter fourth integer: ");	// prompt
		num4 = input.nextInt(); // read fourth integer from user
		
		System.out.print("Enter fifth integer: ");	// prompt
		num5 = input.nextInt();	// read fifth integer from user
		
		smallest = num1;		// set first integer as the smallest for comparison
		if (num2 < smallest)
			smallest = num2;
		
		if (num3 < smallest)
			smallest = num3;
		
		if (num4 < smallest)
			smallest = num4;
		
		if (num5 < smallest)
			smallest = num5;
		
		largest = num1;	// set the first integer as the largest for comparison
		if (num2 > largest)
			largest = num2;
		
		if (num3 > largest)
			largest = num3;
		
		if (num4 > largest)
			largest = num4;
		
		if (num5 > largest)
			largest = num5;
		
		System.out.printf("Smallest integer is: %d\n", smallest);	// display the smallest integer
        System.out.printf("Largest integer is %d\n", largest); // display the largest integer
        
        input.close();
	}

}
