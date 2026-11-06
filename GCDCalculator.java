package Looping;

import java.util.Scanner;

public class GCDCalculator {
	
	public static void calculate(int first, int second) {
		if(first <= 0 || second <= 0) {
			System.out.println("Invalid Input");
			return;
		}
		
		while(second != 0) {
			int remainder = first % second;
			first = second;
			second = remainder;
		}
		System.out.println(first);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of A nad B");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		GCDCalculator gcd = new GCDCalculator();
		gcd.calculate(a, b);
		
	}

}
