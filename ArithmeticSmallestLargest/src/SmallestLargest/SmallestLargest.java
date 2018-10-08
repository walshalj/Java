package SmallestLargest;

import java.util.Scanner;

public class SmallestLargest {

	public static void main(String[] args) {
	
		    Scanner input = new Scanner(System.in);
				
				// initialize variables
				int num1;	// first integer for user input
				int num2;	// second integer for user input
				int num3;	// third integer for user input
				int sum;	// sum of num1, num2, and num3
				int average;	// average of num1, num2, and num3
				int product;	// product of num1, num2, and num3
				int smallest;	// smallest number from num1, num2, and num3
				int largest;	// largest number from num1, num2, and num3
				
				System.out.print("Enter first integer: ");	// prompt
				num1 = input.nextInt(); // read first integer from user
				
				System.out.print("Enter second integer: ");	// prompt
				num2 = input.nextInt();	// read second integer from user
				
				System.out.print("Enter third integer: ");	// prompt
				num3 = input.nextInt();	// read third integer from user
				
				sum = num1 + num2 + num3;	// add numbers
				average = (sum) / 3;	// average of the numbers
				product = num1 * num2 * num3;	// product of the numbers
				
				// Compare the numbers to find the smallest value
				smallest = num1;
				if (num2 <= smallest)
					smallest = num2;
				
				if (num3 <= smallest)
					smallest = num3;
				
				// Compare the numbers to find the largest value
				largest = num1;
				if (num2 >= largest)
					largest = num2;
				
				if (num3 >= largest)
					largest = num3;
				
				System.out.printf("Sum is %d\n", sum);	// display the sum
				System.out.printf("Average is %d\n", average);	// display the average
				System.out.printf("Product is %d\n", product);	// display the product
				System.out.printf("Smallest is %d\n", smallest);	// display the smallest number
				System.out.printf("Largest is %d\n", largest);	// display the largest number

				input.close();
	}

}
