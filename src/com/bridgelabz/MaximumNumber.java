package com.bridgelabz;

import java.util.Arrays;

public class MaximumNumber {
    public static <T> T testCase(T... a) {
        Arrays.sort(a);
        return a[a.length - 1];
    }

    public static void main(String[] args) {
        System.out.println("Maximum among all integer values is :" + testCase(2, 9, 98, -2, 8, 7, 987, 765));
        System.out.println("Maximum among all float values is :" + testCase(3.9f, 89.8f, 876.6f, 876.6f, 999.8f, 5.7f, 4.5f));
        System.out.println("Maximum among all string values is :" + testCase("Swapnil", "Shubham", "Kunal", "Shivaji", "Mangal", "Sheetal"));


    }
}
