package com.company;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class StringExtendeAndArreys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Task:
        System.out.println("Please enter a word:");
        String firstStatement = scanner.next();
        Pattern vowels = Pattern.compile("[a,e,i,o,u,A,E,I,O,U]");
        Matcher m = vowels.matcher(firstStatement);
        int vocalCounter = 0;
        while (m.find()) {
            vocalCounter++;
        }
        System.out.println("The number of vowels in the word: " + vocalCounter);

        System.out.println("Please enter number1:");
        String firstnumber = scanner.next();
        int numStr1 = Integer.parseInt(firstnumber);
        System.out.println("Please enter number2:");
        String secondnumber = scanner.next();
        int numStr2 = Integer.parseInt(secondnumber);
        System.out.println("Please enter number3:");
        String thirdnumber = scanner.next();
        int numStr3 = Integer.parseInt(thirdnumber);
        System.out.println("Please enter number4:");
        String forthnumber = scanner.next();
        int numStr4 = Integer.parseInt(forthnumber);
        System.out.println("Please enter number5:");
        String fifthnumber = scanner.next();
        int numStr5 = Integer.parseInt(fifthnumber);
        int result = ((numStr1 + numStr2) * (numStr3 + numStr4)) / (numStr5);
        System.out.println(result);
    }
    // Write a program that will act as a simple calculator where you set a variable as the operator and based on that
    // perform an arithmetic operation. For example if the operator variable is "+" then it will add two numbers  and so on
}



