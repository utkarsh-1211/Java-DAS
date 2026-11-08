package Looping;

import java.util.Scanner;

public class Q7 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter num : ");
	int n = sc.nextInt();
	SquareSum sum = new SquareSum();
	sum.calculate(n);
}
}
