package Looping;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Num : ");
		int n = sc.nextInt();
		
		 EvenNumberPrinter even = new  EvenNumberPrinter();
         even.printEvenNumbers(n);
		 even.calculate(n);
		 
;
		
	}

}
