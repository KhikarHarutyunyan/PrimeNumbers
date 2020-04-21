package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MyArray myArray2 = new MyArray();
        Scanner scanner = new Scanner(System.in);
        int maxNumber = scanner.nextInt();
        ArrayList<Integer> integers = myArray(myArray2::foundPrimeNumbers,maxNumber);
        System.out.println(integers);
    }
    public static ArrayList<Integer> myArray(Test<Integer> test, Integer number){
        return test.test(number);
    }
}
