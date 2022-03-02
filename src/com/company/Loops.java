package com.company;

public class Loops {
    public static void main(String[] args) {
        int number = 4;
        while (number < 50) {
            System.out.println(number);
            number = number + 4;
        }
        for (int i = 1; i < 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }
        int value = 1;
        for (value = 1; value < 51; value++) {
            if (value % 3 == 0 && value % 7 == 0){
                System.out.println("FizzBuzz");
            } else if (value % 3 == 0)  {
                System.out.println("Fizz");
            } else if (value % 7 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(value);
            }
        }
    }
}
