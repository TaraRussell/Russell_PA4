package russell_p1;

import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter a four-digit integer: ");
		
		int n; // user input
		
		n = scnr.nextInt();
		
		// placement of each digit
		int a = n / 1000;
		int b = (n % 1000) / 100;
		int c = (n % 100) / 10;
		int d = n % 10;
		
		// add 7 to each digit, divide by 10 & output the remainder
		a = (a + 7) % 10;
		b = (b + 7) % 10;
		c = (c + 7) % 10;
		d = (d + 7) % 10;
		
		// print the digits in the order of c d a b
		System.out.println("The encrypted number is: " + c + d + a + b);

	}

}
