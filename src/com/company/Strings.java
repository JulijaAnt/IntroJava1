package com.company;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Strings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write a program that will act as a simple calculator where you set a variable as the operator and based on that
        // perform an arithmetic o

        System.out.println("Please enter number1:");
        String firstnumb = scanner.next();
        System.out.println("Please enter number2:");
        String secondnum = scanner.next();
        System.out.println("Please enter operation");
        String operation = scanner.next();
        int numStr1 = Integer.parseInt(firstnumb);
        int numStr2 = Integer.parseInt(secondnum);
        switch (operation){
            case "+":
        System.out.println("Answer is :" + (numStr1 + numStr2));
        break;
            case "-":
        System.out.println("Answer is :" + (numStr1 - numStr2));
        break;
            case "*" :
                System.out.println("Answer is :" + (numStr1 * numStr2));
                break;
            case "/":
        System.out.println("Answer is :" + (numStr1 / numStr2));
        break;
            default:
                throw new IllegalStateException("Unexpected value: " + operation);
        }
    }
    }
