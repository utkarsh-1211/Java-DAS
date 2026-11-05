package Looping;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. for how many even want ");
		int num = sc.nextInt();
		int count = 1;
		while(count <= num) {
			System.out.println(count * 2);
			if(count < num) {
				System.out.println(" ");
				
			}
			count++;
			}
		System.out.println();
		
	
	}

}
