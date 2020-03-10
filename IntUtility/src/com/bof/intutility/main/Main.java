package com.bof.intutility.main;

import com.bof.intutility.IntUtility;

public class Main {
    public static void main(String[] args) {
        IntUtility sum = new IntUtility(20);
        sum.printSumFrom1ToN();
        sum.checkPrime();
        sum.printEvenNumber();
        sum.printDivider();
    }
}
