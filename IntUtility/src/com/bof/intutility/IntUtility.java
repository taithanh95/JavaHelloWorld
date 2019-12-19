package com.bof.intutility;

public class IntUtility {
    private int n;

    public IntUtility(int n) {
        this.n = n;
    }

    public void printSumFrom1ToN() {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + i;

        }
    }

    public boolean checkPrime() {
        boolean result = true;
        if (n < 2) {
            result = false;
        } else {

            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    result = false;
                }
            }
        }
        if (result == true) {
            System.out.println("La so nguyen to");
        } else {
            System.out.println("Khong la so nguyen to");
        }
        return result;
    }

    public void printEvenNumber() {
        int evenNumber = 0;
        while (evenNumber < n) {
            System.out.println("..." + evenNumber);
            evenNumber += 2;
        }
    }

    public void printDivider() {
        int divisor = 1;
        while (divisor < n) {
            if (n % divisor == 0) {
                System.out.println(+divisor);
                divisor++;
            }

        }
    }
}
