import java.util.Arrays;

// A simple FizzBuzz program
public class FizzBuzz {

	public static void main(String[] args) {
		
		// *BONUS save results to an array for later reference 
		String[] fizzArray = new String[100]; // allocate memory for array
		
		// print numbers 1-100
		for (int i = 1; i <= 100; i++) {
			// if i is divisible by 15, print FizzBuzz
			if (i % 15 == 0) {
				//System.out.print(" FizzBuzz");
				fizzArray[i-1] = "FizzBuzz";
			}
			// if i is divisible by 5, print Buzz
			else if (i % 5 == 0) {
				//System.out.print(" Buzz");
				fizzArray[i-1] = "Buzz";
			}
			// if i is divisible by 3, print Fizz
			else if (i % 3 == 0) {
				//System.out.print(" Fizz");
				fizzArray[i-1] = "Fizz";
			}
			else {
				//System.out.print(" "+i);
				fizzArray[i-1] = String.valueOf(i);
			}
		}
		System.out.print(Arrays.toString(fizzArray));
		
	}
	
}
