package primeNumber;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number to text for Prime-ness: ");
		int number = scanner.nextInt();
		
		System.out.println("Your number is " + number);
		
		
		
		if(isPrimeNumber(number)) {
			System.out.println(number + " is a prime Number");
		}else {
			System.out.println(number + " is a composite numbers");
		}
		
	}

	private static boolean isPrimeNumber(int number) {
		if(number == 1) return false;
		for(int i = 2; i < number; i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
