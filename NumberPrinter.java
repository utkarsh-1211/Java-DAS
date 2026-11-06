package Looping;

import java.util.Scanner;

public class NumberPrinter {
	
	public void printNumbers(int num) {
		for(int i = 1; i <= num; i++) {
			System.out.print(i);
			if( i< num) {
				System.out.print(" ");
				
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Numder For Printing : ");
		int a = sc.nextInt();
		NumberPrinter n = new NumberPrinter();
		n.printNumbers(a);
	}
	
	
	

}
