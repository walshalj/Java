import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
			
			// Initialize variable
			int num1;	// first integer for user input
			int num2;	// second integer for user input
			int sum;	// num1 + num2
			int difference;	// num1 - num2
			int product;	// num1 x num2		
			int quotient;	// num1 / num2
			
			System.out.print("Enter first integer: ");	// prompt
			num1 = input.nextInt();	// read first number from user
			
			System.out.print("Enter second integer: ");	// prompt
			num2 = input.nextInt();	// read second number from user
			
			sum	= num1 + num2;	// add numbers
			product	= num1 * num2;	// multiply numbers
			difference = num1 - num2;	// difference of numbers
			quotient = num1 / num2;	// division of numbers
			
			System.out.printf("Sum = %d\n", +sum);	// display sum		
			System.out.printf("Difference = %d\n", +difference);	// display difference
			System.out.printf("Product = %d\n", +product);	// display product
			System.out.printf("Quotient = %d\n", +quotient);	// display quotient
			
			input.close();
	}

}
