package Looping;

public class SquareSum {
public void calculateSquareSum(int num) {
	if(num <= 0) {
		System.out.println("Invalid Input");
		return;
		
	}
	int sum = 0;
	for(int i = 1; i <= num; i++) {
		System.out.print(i*i);
		if(i < num) {
			System.out.print(" + ");
		}
		sum += i*i;
		}
	
	System.out.println(" = "+sum);
	
}
public void calculateCubSum(int num){
	if(num <= 0) {
		System.out.println("Invalid Input");
		return;
		
	}
	
	int sum = 0;
	for(int i = 1; i <=num; i++) {
		System.out.print(i*i*i);
		if(i<num) {
			System.out.print(" + ");
		}
		sum += i*i*i;
	}
	System.out.print(" = "+sum);
}
}
