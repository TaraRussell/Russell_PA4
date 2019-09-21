package russell_p1;

import java.util.Scanner;

public class Decrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		
		System.out.print("Enter the four-digit encrypted integer: ");
		
		int n; // user input
		
		n = scnr.nextInt();
		
		int a = n / 1000;
		int b = (n % 1000) / 100;
		int c = (n % 100) / 10;
		int d = n % 10;
		
		// decrypt to original integer
		
		a = (a + 3) % 10;
		b = (b + 3) % 10;
		c = (c + 3) % 10;
		d = (d + 3) % 10;
		
		// print decrypted number 
		
		System.out.println("The decrypted number is: " + c + d + a + b);

	}

}
