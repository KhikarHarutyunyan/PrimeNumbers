package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        Scanner scanner = new Scanner(System.in);
        int maxNumber = scanner.nextInt();
        ArrayList<Integer> integers = myArray(myArray::foundPrimeNumbers,maxNumber);
        System.out.println(integers);
    }
    public static ArrayList<Integer> myArray(Test<Integer> test, Integer number){
        return test.test(number);
    }
}
