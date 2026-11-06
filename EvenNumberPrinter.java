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

        int k = num / 2;          // how many even numbers
        int sum = k * (k + 1);    // sum of first k even numbers

        for (int i = 2; i <= num; i += 2) {
            System.out.print(i);
            if (i + 2 <= num) {
                System.out.print(" + ");
            }
        }
        System.out.println(k == 0 ? "0" : " = " + sum);
    }
}
