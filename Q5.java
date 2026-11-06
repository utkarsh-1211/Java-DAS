package Looping;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Valuve : ");
		
		int a = sc.nextInt();
		NaturalNumberSum n = new NaturalNumberSum();
		n.calculate(a);
	}

}
