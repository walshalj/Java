

import java.util.Scanner;

public class CompareIntegers {

	public static void main(String[] args) {
		// main method begins execution of Java application
		
					// create Scanner to obtain input from command window
					Scanner input = new Scanner(System.in);
					
					// initialize variables
					int num1;	// first integer for input
					int num2;	// second integer for input
					
					System.out.print("Enter first integer: ");	// prompt
					num1 = input.nextInt();	// read first integer from user
					
					System.out.print("Enter second integer: ");	// prompt
					num2 = input.nextInt();	// read second integer from user
					
					if (num1 > num2)
						System.out.printf("%d is larger than %d\n",num1,num2);
					
					if (num1 < num2)
						System.out.printf("%d is larger than %d\n", num2, num1);
					
					if (num1 == num2)
			System.out.println("These numbers are equal");
					
					input.close();

	}

}
