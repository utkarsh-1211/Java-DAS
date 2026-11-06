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
        if (num <= 0) {
            System.out.println("Invalid input");
            return;
        }

        int sum = 0;
        boolean first = true;

        for (int i = 2; i <= num; i += 2) {
            if (!first) {
                System.out.print(" + ");
            }
            System.out.print(i);
            sum += i;
            first = false;
        }

        if (first) {
            // num is 1, so there are no even numbers
            System.out.println("0");
        } else {
            System.out.println(" = " + sum);
        }
    }
}
