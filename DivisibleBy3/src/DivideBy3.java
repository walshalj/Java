import java.util.Scanner;


public class DivideBy3 {

	public static void main(String[] args) {
		 int n;

	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter any number:");

	        n = input.nextInt();

	        if(n % 3 == 0)

	        {

	            System.out.println(n+" is divisible by 3");

	        }

	        else

	        {

	            System.out.println(n+" is not divisible by 3");

	        }
	        
	        input.close();

	}

}
