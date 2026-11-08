package Looping;

public class EvenNumberPrinter {

    public void printEvenNumbers(int num) {
        if (num <= 0) {
            System.out.println("Invalid input");
            return;
        }
        for (int i = 2; i <= num; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public void calculate(int num) {
        if (num <= 1) {
            System.out.println("Invalid input");
            return;
        }
        int sum = 0;
       for(int i = 2 ; i<=num ; i++) {
    	   if(i%2==0) {
    		   System.out.print(i);
    		   sum+=i;
    		   if(num%2==0 && i<num) System.out.print(" + ");
        	   if(num%2!=0 && i<(num-2)) System.out.print(" + ");  	 	 	
    	   }
    	   
    	   
       }
       
       System.out.println(" = " + sum);
    }
}
