package com.bridgelabz;

public class MaximumNumber {
    public static <T extends Comparable> T testCase(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0 && y.compareTo(z) > 0) {
            max = y;
        } else if (z.compareTo(max) > 0 && z.compareTo(y) > 0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Maximum among three integer values is :" + testCase(900, 5000, 10));
        System.out.println("Maximum among three float values is :" + testCase(9.8f, 5.7f, 101.7f));
        System.out.println("Maximum among three string values is :" + testCase("Swapnil", "Shubham", "Kunal"));
    }
}
