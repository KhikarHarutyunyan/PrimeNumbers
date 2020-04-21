package com.company;

import java.util.ArrayList;

public class MyArray {
    public ArrayList<Integer> foundPrimeNumbers(Integer maxNumber) {
        int count;
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i < maxNumber; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0){
                    count++;
                }
            }
            if (count == 2){
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }
}
