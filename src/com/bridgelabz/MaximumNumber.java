package com.bridgelabz;

import java.util.Scanner;

public class MaximumNumber {
    public static Integer testCase(Integer x, Integer y, Integer z) {
        Integer max = x;
        if (y.compareTo(max) > 0 && y.compareTo(z) > 0) {
            max = y;
        } else if (z.compareTo(max) > 0 && z.compareTo(y) > 0) {
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three Integer number :");
        Integer x = scanner.nextInt();
        Integer y = scanner.nextInt();
        Integer z = scanner.nextInt();
        System.out.println("Maximum Of Three Integers is :" + testCase(x, y, z));
    }
}
