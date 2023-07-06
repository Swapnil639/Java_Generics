package com.bridgelabz;

class Generic<T extends Comparable>{
    T x;
    T y;
    T z;

    public Generic(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public T testCase() {
        T max = x;
        if (y.compareTo(max) > 0 && y.compareTo(z) > 0) {
            max = y;
        } else if (z.compareTo(max) > 0 && z.compareTo(y) > 0) {
            max = z;
        }
        return max;
    }
}

public class MaximumNumber {
    public static void main(String[] args) {
        Generic<Integer> generics1=new Generic<>(900, 5000, 10);
        Generic<Float> generics2=new Generic<>(9.8f, 5.7f, 101.7f);
        Generic<String> generics3=new Generic<>("Swapnil", "Shubham", "Kunal");
        System.out.println("Maximum among three integer values is :" + generics1.testCase());
        System.out.println("Maximum among three float values is :" + generics2.testCase());
        System.out.println("Maximum among three string values is :" + generics3.testCase());
    }
}
