package Looping;

public class NaturalNumberSum {
	public void calculate(int num ) {
		int sum = 0;
		for(int i = 1; i <= num; i++){
			if(i < num) {
				System.out.print(i+" + ");
				}
			else if(i == num) {
					System.out.print(i);
				}
			sum += i;
			
			}
		System.out.println(" = "+sum);
	}

}
