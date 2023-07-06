package com.bridgelabz;

import java.util.Arrays;

public class MaximumNumber<T> {
    public T testCase(T... a) {
        Arrays.sort(a);
        T max = a[a.length - 1];
        printMax(max);
        return max;
    }

    private void printMax(T max) {
        System.out.println(max);

    }

    public static void main(String[] args) {
        MaximumNumber<Integer> maximumInteger = new MaximumNumber();
        MaximumNumber<Float> maximumFloat = new MaximumNumber<>();
        MaximumNumber<String> maximumString = new MaximumNumber<>();
        maximumInteger.testCase(2, 9, 98, -2, 8, 7, 987, 765);
        maximumFloat.testCase(3.9f, 89.8f, 876.6f, 876.6f, 999.8f, 5.7f, 4.5f);
        maximumString.testCase("Swapnil", "Shubham", "Kunal", "Shivaji", "Mangal","Sheetal");



    }
}
