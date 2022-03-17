package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class Practical_work {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that receives some numbers based on the user’s choice and then
        // returns the largest number of the ones the user entered.

        // Prompt the user for input
        System.out.print("How many numbers do you want to enter?: ");
        int[] numbers = new int[scanner.nextInt()]; // use the input to create an array to hold the values

        // Populate the array with data.
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scanner.nextInt();}
            int maximum = numbers[0];
            for (int i = 0; i < numbers.length; i++) {
                if (maximum < numbers[i]) {
                    maximum = numbers[i];
                }
            }
            System.out.println("The largest number you entered is: " + maximum);


            // Write a program to find out if in a list of numbers entered by a user
            // there are no multiples of 3.

        System.out.println("How many numbers");
        int[] number = new int[scanner.nextInt()];
        for (int j = 0; j < number.length; j++) {
            System.out.println("Enter a number:");
            number[j] = scanner.nextInt();}
            boolean ifThree = false;
           for (int t = 0; t < numbers.length; t++) {
            if (numbers[t] % 3 == 0) {
            ifThree = true;
               break;
          }
       }
   if (ifThree) {
            System.out.println("A multiple of three exists");
       } else {
           System.out.println("No multiple of three exists");


            }
      //        //Write a program that accepts a String from the user and returns an array of integers representing the counts
                //of each vowel in the String. The array returned by your method should hold 5 elements: the first is the
                //count of As, the second is the count of Es, the third Is, the fourth Os, and the fifth Us.

        System.out.println("Please enter a word:");
        String text = scanner.next();
                // We know that the array is going to have a length of 5
                int[] vowelCount = new int[5];
                // Loop through the string and count the vowels
                for (int s = 0; s < text.length(); s++) {
                    char currentLetter = text.toLowerCase().charAt(s);
                    switch (currentLetter) {// curly braces
                        case 'a':
                            vowelCount[0]++;
                            break;
                        case 'e':
                            vowelCount[1]++;
                            break;
                        case 'i':
                            vowelCount[2]++;
                            break;
                        case 'o':
                            vowelCount[3]++;
                            break;
                        case 'u':
                            vowelCount[4]++;
                            break;
                    }
                }// Output to the console.
                System.out.println("The vowel breakdown for " + text + " is " + Arrays.toString(vowelCount));

            }
        }