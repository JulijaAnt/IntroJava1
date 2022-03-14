package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Massivy_arre {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Write a program to find the average of a set ofnymbers that user enters, allows the user to decidethe numbers of
        // integer to enter and interactively returns the result
        int i;

        System.out.println("How many numbers you want to enter:");
        String k = scanner.next();
        int count = Integer.valueOf(k);
        int[] numbers = new int[count];
        int sum = 0;


        for (i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number:");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];

        }
        float aver = (sum / count);
        System.out.println("Average:" + aver);

    }
}


