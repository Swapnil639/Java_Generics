package com.bridgelabz;

import java.util.Scanner;

public class MaximumNumber {
    public static Float testCase(Float x, Float y, Float z) {
        Float max = x;
        if (y.compareTo(max) > 0 && y.compareTo(z) > 0) {
            max = y;
        } else if (z.compareTo(max) > 0 && z.compareTo(y) > 0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three Float number :");
        Float x = scanner.nextFloat();
        Float y = scanner.nextFloat();
        Float z = scanner.nextFloat();
        System.out.println("Maximum Of Three Floats is :" + testCase(x, y, z));
    }
}
