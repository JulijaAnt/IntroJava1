package com.company;

public class Main {

    public static void main(String[] args) {
	System.out.println("Hello now");

    int number = 5;
    int value = 6;
    int age = 23;
    double weight = 56.23;
    double height = 155.23;
    String gender = "Female";


    System.out.println("Sum of number plus value is: " + (number + value));
    System.out.println("deduct number minus value is: " + (number - value));
    System.out.println("Multiply number and value is: " + (number * value));
    System.out.println("Division number and value is: " + (number / value));
    System.out.println("Division number and value is: " + (number / value));
    System.out.println("user age is " + age);
    System.out.println("user hight is " + height);
    System.out.println("user gender is " + gender);
    System.out.println(8==9);
    System.out.println(8==9 && 8>7);
    System.out.println(8==8 && 8>7);
    System.out.println(8==8 || 8>7);
    System.out.println(6<9 && 9>2);
    System.out.println(5>9 || 8>3);
    System.out.println(8==2 && 7<6);
    if ( number < 9 && number > 14){
        System.out.println("ok");
    } else {
        System.out.println("not ok");
    }
}}
