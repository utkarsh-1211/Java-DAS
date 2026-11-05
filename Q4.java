package Looping;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. for odd that wanted ");
		int num = sc.nextInt();
		int count = 1;
		while(count <= num) {
			System.out.println(2 * count - 1);
			if(count < num) {
				System.out.println(" ");
			}
			count++;
		}
		System.out.println();
	}

}
