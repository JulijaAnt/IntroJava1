package com.company;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Home_work {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write a program that will output the prime numbers between 1- 80.A prime number is a number that can only be divided by 1 and itself without giving any remainders.
        int i;
        int j;
        int k;
        for (i = 2; i <= 80; i++) {
            k = 1;
            for (j = 2; j <= i; j++) {
                if (i % j == 0)
                    k++;
            }
            if (k <= 2) {
                System.out.println(i);
            }
            // Write a program that will act as a simple calculator where you set a variable as the operator and based on that
            // perform an arithmetic operation. For example if the operator variable is "+" then it will add two numbers  and so on
        }
        int a = 5;
        int b = 2;
        int answer;
        char o = '+';
        if (o == '+') {
            answer = a + b;
            System.out.println("Answer " + answer);
        } else if (o == '-') {
            answer = a - b;
            System.out.println("Answer " + answer);
        } else if (o == '*') {
            answer = a * b;
            System.out.println("Answer " + answer);
        } else if (o == '/') {
            answer = a / b;
            System.out.println("Answer " + answer);
        } else {
            System.out.println("Operation failed");
        }
//Write a programm that returns true interactively, if a user enters a string containig any of these characters 'u',
//'w', 6, i, b, q.

        System.out.println("Please enter a word:");
        String firstStatement = scanner.next();
        Pattern signstofind = Pattern.compile("[u,w,6,i,b,q]");
        Matcher m = signstofind.matcher(firstStatement);
        if (m.find()) {
            System.out.println("True");
        } else {
            System.out.println("False");

            //Write a programm that accepts a String form a user and prints an interactive response telling the user
            //if the word is the same when spelt backwards. E.G.bread when spelt backwards is daerbm which is not the same.
        }


        System.out.println("Please enter a word:");
        String Wordtoreverse = scanner.next();
        String reversedString = "";
        for (int v = Wordtoreverse.length() - 1; v > -1; v--) {
            reversedString += Wordtoreverse.charAt(v);
            System.out.println(reversedString);
        }
        if (Wordtoreverse.equalsIgnoreCase(reversedString)) {
            System.out.println("Words are the same " + (reversedString));
        } else {
            System.out.println("Words are not the same " + (Wordtoreverse)  +  (reversedString));
        }
        //Write a program that accepts any of the primary colors as a String and retuns the complimentary
        //color of that color  to the user

        System.out.println("Please enter a color:");
        String PrimeColor = scanner.next();
        String red = "red";
        String blue = "blue";
        String yellow = "yellow";
        if (PrimeColor.equalsIgnoreCase(red)){
        System.out.println("Complimentary color to red is green");
        } else if (PrimeColor.equalsIgnoreCase(blue)){
            System.out.println("Complimentary color to blue is orange");
        } else if (PrimeColor.equalsIgnoreCase(yellow)){
            System.out.println("Complimentary color to yellow is orange");
        } else {
            System.out.println("Please enter primary colors only");
        }

        }}
