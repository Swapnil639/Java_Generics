package com.bridgelabz;

public class MaximumNumber {
    public static String testCase(String x, String y, String z) {
        String max = x;
        if (y.compareTo(max) > 0 && y.compareTo(z) > 0) {
            max = y;
        } else if (z.compareTo(max) > 0 && z.compareTo(y) > 0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("Maximum Of Three Floats is :" + testCase("Apple","Peach","Banana"));
    }
}
