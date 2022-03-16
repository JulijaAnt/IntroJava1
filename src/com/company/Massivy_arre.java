package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;

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
        float sum = 0;
        for (i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number:");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];

        }
        float aver = (sum / count);
        System.out.println("Average:" + aver);

        //task 1 write a programm that receives some numbers based on the user' s choice and then returns the
        // largest number of those entered by the user.

        int j;
        int[] number = new int[3];
        int maxNum = number[0];
        for (j = 0; j <number.length; j++) {
            System.out.println("Enter a number:");
            number[j] = scanner.nextInt();
            for (int l : number)
                if (l > maxNum)
                    maxNum = l;
            }

            System.out.println("Maximum number = " + maxNum);

        //write a programm that accepts a String from the user an returns an array of integers representing the counts of each
        //vowel in the String. The array returned should hol 5 elements: the first count of a, the second - e, the
        // thir - i, the fourth - o and the fifths - u.
        int countera = 0;
        int countere = 0;
        int counteri = 0;
        int countero = 0;
        int counteru = 0;
        System.out.println("Please enter a word:");
        String firstStatement = scanner.next();
        for (int c = 0; c < firstStatement.length(); c++) {
            char currentLetter = firstStatement.toLowerCase().charAt(c);
            if (firstStatement.charAt(c) == 'a') {
                countera++;
            }else if (firstStatement.charAt(c) == 'e') {
                countere++;
            }else if (firstStatement.charAt(c) == 'i') {
                counteri++;
            }else if (firstStatement.charAt(c) == 'o') {
                countero++;
            }else if  (firstStatement.charAt(c) == 'u') {
                counteru++;
            }else {
                System.out.println("No vowels found");
            }
            System.out.println(countera + countere + counteri + countero + counteru);
        }

        System.out.println("Please enter a word:");
        String Statement = scanner.next();
        char[] StatementArray = Statement.toCharArray();
        ArrayList<Character> vowels = new ArrayList<Character>();
        for (int z = 0; z < StatementArray.length; z++){
            vowels.add(StatementArray[z]);
            for(Character character : vowels){
                int counter = 0;
                {
                    for (int t = 0; t < Statement.length(); t++)
                    {
                        if(Statement.charAt(t) == character)
                        {
                            counter++;
                        }
                    }
                }
                System.out.println(character + " " + counter);
        }
}}}
